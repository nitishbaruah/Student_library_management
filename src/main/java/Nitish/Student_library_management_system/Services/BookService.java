package Nitish.Student_library_management_system.Services;

import Nitish.Student_library_management_system.Models.Book;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    public String addBook(Book book){

        return"Book added Successfully";
    }
}
