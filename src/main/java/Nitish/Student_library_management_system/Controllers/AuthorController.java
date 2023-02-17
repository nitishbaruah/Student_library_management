package Nitish.Student_library_management_system.Controllers;

import Nitish.Student_library_management_system.DTOs.AuthorEntryDTO;
import Nitish.Student_library_management_system.Models.Author;
import Nitish.Student_library_management_system.Services.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Author")
public class AuthorController {
    @Autowired
    AuthorService authorService;

    @PostMapping("/add")
    public String addAuthor(@RequestBody AuthorEntryDTO author){

        return authorService.addAuthor(author);
    }
}
