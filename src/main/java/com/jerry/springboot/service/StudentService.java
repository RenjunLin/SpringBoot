package com.jerry.springboot.service;

import com.jerry.springboot.domain.Student;
import com.jerry.springboot.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Student addStudent(String name, Integer age){
        Student student = new Student();
        student.setAge(age);
        student.setName(name);
        return studentRepository.save(student);
    }

    public List<Student> getStudentList(){
        return studentRepository.findAll();
    }

    public Student getStudentById(Integer id){
        return studentRepository.findOne(id);
    }

    public List<Student> getStudentByAge(Integer age){
        return studentRepository.findByAge(age);
    }
}
