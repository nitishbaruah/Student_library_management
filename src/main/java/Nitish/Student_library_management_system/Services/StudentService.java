package Nitish.Student_library_management_system.Services;

import Nitish.Student_library_management_system.DTOs.StudentEntryDTO;
import Nitish.Student_library_management_system.DTOs.StudentUpdateMobNoDTO;
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

    public String addStudent(StudentEntryDTO student){
        //BAsic attr of student set through postman
        //card obj auto created when student created
        Student newStudent= new Student();
        newStudent.setMobNo(student.getMobNo());
        newStudent.setName(student.getName());
        newStudent.setCountry(student.getCountry());
        newStudent.setAge(student.getAge());
        newStudent.setEmail(student.getEmail());
        CardId card= new CardId();
        card.setCardStatus(CardStatus.Activated); // Card status
        card.setStudent(newStudent); //Set foreign key attribute
        //Filling the uni directional part

        // Back to student
        newStudent.setCardId(card);

        //If there was a unidirectional mapping : we had to save both of them.
        //studentRepo.save () and cardRepo.save()
        //But we are using bidirectional : Child will automatically be saved.

        studentRepository.save(newStudent);
        //By cascading effect, child will automatically be saved (cardRepo will be saved)



        return"Student added Successfully and Card generated";
    }
    public String findStudentByEmail(String email){
        Student student= studentRepository.findByEmail(email);

        return student.getName();
    }

    public String updateStudentMobNo(StudentUpdateMobNoDTO studentUpdateMobNoDTO){
        Student student=studentRepository.findById(studentUpdateMobNoDTO.getId()).get();
        student.setMobNo(studentUpdateMobNoDTO.getMobNo());
        studentRepository.save(student);
        return "Mobile no updated";
    }



}
