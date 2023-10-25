package com.example.Repository;


import com.example.Model.Student;
import org.springframework.data.repository.CrudRepository;


public interface IStudentRepo extends CrudRepository<Student , Integer> {

}