package Nitish.Student_library_management_system.Services;

import Nitish.Student_library_management_system.DTOs.IssueBookDTO;
import Nitish.Student_library_management_system.Enums.CardStatus;
import Nitish.Student_library_management_system.Enums.TransactionStatus;
import Nitish.Student_library_management_system.Models.Book;
import Nitish.Student_library_management_system.Models.CardId;
import Nitish.Student_library_management_system.Models.Transactions;
import Nitish.Student_library_management_system.Respositories.BookRepository;
import Nitish.Student_library_management_system.Respositories.CardIdRepository;
import Nitish.Student_library_management_system.Respositories.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class TransactionService {
    @Autowired
    TransactionRepository transactionRepository;

    @Autowired
    BookRepository bookRepository;

    @Autowired
    CardIdRepository cardIdRepository;

    public String issueBook(IssueBookDTO issueBookDTO) throws Exception {
        Transactions transactions= new Transactions();
        int bookID=issueBookDTO.getBookId();
        int cardID=issueBookDTO.getCardId();
        Book book=bookRepository.findById(bookID).get();
        CardId card=cardIdRepository.findById(cardID).get();

        transactions.setBook(book);
        transactions.setCardId(card);
        transactions.setTransactionId(UUID.randomUUID().toString());
        transactions.setIssueOperation(true);
        transactions.setTransactionStatus(TransactionStatus.Pending);

        //Validation for transaction statustra
        if(book==null || book.isIssued()==true){
            transactions.setTransactionStatus(TransactionStatus.Failed);
            transactionRepository.save(transactions);
            throw new Exception("Book is not available");

        }
        if(card==null || card.getCardStatus()!= CardStatus.Activated){
            transactions.setTransactionStatus(TransactionStatus.Failed);
            transactionRepository.save(transactions);
            throw new Exception("Invalid card");
        }
        transactions.setTransactionStatus(TransactionStatus.Success);

        book.setIssued(true);

        book.getTransactionsList().add(transactions);
        card.getBookIssued().add(book);
        card.getTransactionsList().add(transactions);

        cardIdRepository.save(card);



        return "Book issued successfully";
    }

}
