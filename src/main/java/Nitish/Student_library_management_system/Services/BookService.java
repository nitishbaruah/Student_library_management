package Nitish.Student_library_management_system.Services;

import Nitish.Student_library_management_system.DTOs.BookEntryDTO;
import Nitish.Student_library_management_system.Models.Author;
import Nitish.Student_library_management_system.Models.Book;
import Nitish.Student_library_management_system.Respositories.AuthorRepository;
import Nitish.Student_library_management_system.Respositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    @Autowired
    AuthorRepository authorRepository;

    @Autowired
    BookRepository bookRepository;

    public String addBook(BookEntryDTO book){
        Author author=authorRepository.findById(book.getAuthorId()).get();
        Book newBook= new Book();
        newBook.setPages(book.getPages());
        newBook.setAuthor(author);
        newBook.setName(book.getName());
        newBook.setGenre(book.getGenre());
        newBook.setIssued(false);

        author.getBookList().add(newBook);
        authorRepository.save(author);

        return"Book added Successfully";
    }
}
