package Nitish.Student_library_management_system.Controllers;

import Nitish.Student_library_management_system.Models.Student;
import Nitish.Student_library_management_system.Services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("student")
public class StudentController {
    @Autowired
    StudentService studentService;

    @PostMapping("/add")
    public String addStudent(@RequestBody Student student){

        return studentService.addStudent(student);
    }

    @GetMapping("/getStudentByEmail")
    public String getStudentByEmail(@RequestParam("Email") String email){
        return studentService.findStudentByEmail(email);
    }
}
