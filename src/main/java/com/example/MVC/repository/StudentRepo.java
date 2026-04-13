package com.example.MVC.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.MVC.Student;

public interface StudentRepo extends JpaRepository<Student, Integer>
{

}
