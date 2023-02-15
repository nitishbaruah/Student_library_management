package Nitish.Student_library_management_system.Controllers;

import Nitish.Student_library_management_system.Models.Book;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("book")
public class BookController {

    @PostMapping("/add")
    public String addBook(Book book){
        return "";
    }
}
