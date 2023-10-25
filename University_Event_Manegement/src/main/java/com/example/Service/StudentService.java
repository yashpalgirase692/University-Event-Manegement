package com.example.Service;

import com.example.Model.Department;
import com.example.Model.Student;
import com.example.Repository.IStudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    IStudentRepo iStudentRepo;

    public String addStudent(Student student) {
        iStudentRepo.save(student);
        return "Student Added Successfully..";
    }


    public Iterable<Student> getAllStudents() {
        return iStudentRepo.findAll();
    }

    public String updateStudentDepartment(Integer id, Department department) {
        Optional<Student> getStudent = iStudentRepo.findById(id);
        Student student = null;
        if(getStudent.isPresent()){
            student = getStudent.get();
        }else{
            return "Student not found..";
        }

        student.setDepartment(department);
        iStudentRepo.save(student);
        return "Student Successfully Updated..";
    }


    public Optional<Student> getStudentById(Integer id) {
        return iStudentRepo.findById(id);
    }

    public String deleteStudent(Integer id) {
        if(iStudentRepo.existsById(id)){
            iStudentRepo.deleteById(id);
            return "Student Deleted Successfully..";
        }else{
            return "Id not exists..";
        }
    }
}