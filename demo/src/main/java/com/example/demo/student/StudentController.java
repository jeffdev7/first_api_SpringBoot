package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController

@RequestMapping(path = "api/student")
public class StudentController {
    private final StudentService studentService;

    @Autowired//for IoC
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> getStudent()
    {
        return studentService.getStudent();
    }

    @PostMapping(path = "/post")
    public void registerNewStudent(@RequestBody Student student)
    {
        studentService.addNewStudent(student);
    }

    @DeleteMapping(path = "{studentId}")
    public void deleteStudent(@PathVariable("studentId") Long studentId)
    {
        studentService.deleteStudent(studentId);

    }

    @PutMapping(path = "{studentId}")
    public void updateStudent(@PathVariable("studentId") Long studentId,
                                @RequestParam(required = false) String name,
                                @RequestParam(required = false) String email)
    {
        studentService.updateStudent(studentId, name, email);

    }

}
