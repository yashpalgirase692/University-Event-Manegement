package com.example.Controller;

import com.example.Model.Department;
import com.example.Model.Student;
import com.example.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;

    @PostMapping("student")
    public String addStudent(@RequestBody Student student){
        return studentService.addStudent(student);
    }
    @GetMapping("students")
    public Iterable<Student> getAllStudents(){
        return studentService.getAllStudents();
    }
    @PutMapping("student/id/{id}/department/{department}")
    public String updateStudentDepartment(@PathVariable Integer id , @PathVariable Department department){
        return studentService.updateStudentDepartment(id , department);
    }
    @GetMapping("student/id/{id}")
    public Optional<Student> getStudentById(@PathVariable Integer id){
        return studentService.getStudentById(id);
    }

    @DeleteMapping("student/id/{id}")
    public String deleteStudent(@PathVariable Integer id){
        return studentService.deleteStudent(id);
    }


}