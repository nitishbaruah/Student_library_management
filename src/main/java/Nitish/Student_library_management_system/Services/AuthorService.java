package Nitish.Student_library_management_system.Services;

import Nitish.Student_library_management_system.DTOs.AuthorEntryDTO;
import Nitish.Student_library_management_system.Models.Author;
import Nitish.Student_library_management_system.Respositories.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {

    @Autowired
    AuthorRepository authorRepository;

    public String addAuthor(AuthorEntryDTO author){
        Author newAuthor=new Author();
        newAuthor.setName(author.getName());
        newAuthor.setAge(author.getAge());
        newAuthor.setCountry(author.getCountry());
        newAuthor.setAuthorRating(author.getAuthorRating());
        authorRepository.save(newAuthor);
        return "Author added successfully";
    }
}
