package Nitish.Student_library_management_system.Services;

import Nitish.Student_library_management_system.Models.Author;
import Nitish.Student_library_management_system.Respositories.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {

    @Autowired
    AuthorRepository authorRepository;

    public String addAuthor(Author author){
        authorRepository.save(author);
        return "Author added successfully";
    }
}
