package com.jerry.springboot.service;

import com.jerry.springboot.domain.Student;
import com.jerry.springboot.lib.enums.ResultEnum;
import com.jerry.springboot.lib.exception.ServerInternalException;
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

    public Student getStudentById(Integer id) throws ServerInternalException{
        Student student = studentRepository.findOne(id);
        if (student == null){
            throw new ServerInternalException(ResultEnum.RESOURCE_NOT_FOUND);
        }
        return student;
    }

    public List<Student> getStudentByAge(Integer age){
        return studentRepository.findByAge(age);
    }
}
