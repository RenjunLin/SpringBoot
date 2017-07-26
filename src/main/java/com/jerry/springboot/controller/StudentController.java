package com.jerry.springboot.controller;

import com.jerry.springboot.bean.input.StudentInput;
import com.jerry.springboot.domain.Student;
import com.jerry.springboot.lib.exception.ServerInternalException;
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
    public Student addStudent(@RequestBody StudentInput studentInput){   //获取json body
        return studentService.addStudent(studentInput.getName(), studentInput.getAge());
    }

    @GetMapping(value = "{id}")
    public Student getStudent(@PathVariable("id") Integer id) throws ServerInternalException{   //获取路径参数
        return studentService.getStudentById(id);
    }

    @GetMapping(value = "")
    public List<Student> getStudentByAge(@RequestParam("age") Integer age){   //获取query param或者表单参数
        return studentService.getStudentByAge(age);
    }
}
