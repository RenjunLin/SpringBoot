package com.jerry.springboot.controller;

import com.jerry.springboot.bean.input.StudentInput;
import com.jerry.springboot.domain.Student;
import com.jerry.springboot.properties.SchoolProperties;
import com.jerry.springboot.service.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "student")
public class StudentController {

    private static final Logger logger = LoggerFactory.getLogger(StudentController.class);

    @Autowired
    private StudentService studentService;

    @GetMapping(value = "list")
    public List<Student> getStudentList(){
        return studentService.getStudentList();
    }

    @PostMapping(value = "add")
    public Student addStudent(@RequestBody StudentInput studentInput){
        return studentService.addStudent(studentInput.getName(), studentInput.getAge());
    }

    @GetMapping(value = "{id}")
    public Student getStudent(@PathVariable Integer id){
        return studentService.getStudentById(id);
    }
}
