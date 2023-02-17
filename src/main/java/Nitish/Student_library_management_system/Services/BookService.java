package Nitish.Student_library_management_system.Services;

import Nitish.Student_library_management_system.DTOs.BookEntryDTO;
import Nitish.Student_library_management_system.Models.Author;
import Nitish.Student_library_management_system.Models.Book;
import Nitish.Student_library_management_system.Respositories.AuthorRepository;
import Nitish.Student_library_management_system.Respositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    AuthorRepository authorRepository;


    public String addBook(BookEntryDTO book){
        int authorId= book.getAuthorId();
        Author author=authorRepository.findById(authorId).get();
        Book newBook= new Book();
        newBook.setPages(book.getPages());
        newBook.setAuthor(author);
        newBook.setName(book.getName());
        newBook.setGenre(book.getGenre());
        newBook.setIssued(false);

        List<Book> currentBookList= author.getBookList();
        currentBookList.add(newBook);
        authorRepository.save(author);

        return"Book added Successfully";
    }
}
