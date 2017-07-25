package com.jerry.springboot.repository;


import com.jerry.springboot.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Integer>{

    public List<Student> findByAge(Integer age);

}
