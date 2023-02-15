package Nitish.Student_library_management_system.Services;

import Nitish.Student_library_management_system.Enums.CardStatus;
import Nitish.Student_library_management_system.Models.CardId;
import Nitish.Student_library_management_system.Models.Student;
import Nitish.Student_library_management_system.Respositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public String addStudent(Student student){
        //BAsic attr of student set through postman
        //card obj auto created when student created
        CardId card= new CardId();
        card.setCardStatus(CardStatus.Activated); // Card status
        card.setStudent(student); //Set foreign key attribute
        //Filling the uni directional part

        // Back to student
        student.setCardId(card);

        //If there was a unidirectional mapping : we had to save both of them.
        //studentRepo.save () and cardRepo.save()
        //But we are using bidirectional : Child will automatically be saved.

        studentRepository.save(student);
        //By cascading effect, child will automatically be saved (cardRepo will be saved)



        return"Student added Successfully and Card generated";
    }
    public String findStudentByEmail(String email){
        Student student= studentRepository.findByEmail(email);

        return student.getName();
    }



}
