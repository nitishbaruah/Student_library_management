package Nitish.Student_library_management_system.Respositories;

import Nitish.Student_library_management_system.Models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {

}
