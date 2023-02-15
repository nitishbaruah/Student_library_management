package Nitish.Student_library_management_system.Respositories;

import Nitish.Student_library_management_system.Models.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Integer> {
}