package Nitish.Student_library_management_system.Controllers;

import Nitish.Student_library_management_system.DTOs.BookEntryDTO;
import Nitish.Student_library_management_system.Models.Book;
import Nitish.Student_library_management_system.Services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("book")
public class BookController {
    @Autowired
    BookService bookService;

    @PostMapping("/add")
    public String addBook(@RequestBody BookEntryDTO book){
        return bookService.addBook(book);
    }
}
