package com.example.MVC.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.example.MVC.Student;
import com.example.MVC.repository.StudentRepo;

@Service
public class StudentService
{
    @Autowired
    private StudentRepo repo;

    public Student saveStudent(Student student)
    {
        return repo.save(student);
    }
    public List<Student> getAllStudents()
    {
        return repo.findAll();
    }
}