package com.example.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Students")
public class Student {
    @Id
    private Integer studentId;
    @Pattern(regexp ="\\b[A-Z][a-zA-Z]*\\b" , message = "First letter of name should be capital only..")
    private String firstName;
    private String lastName;
    @Min(18)
    @Max(25)
    private Integer age;
    @Enumerated(EnumType.STRING) // It will get stored as string in database not integer..
    private Department department;
}