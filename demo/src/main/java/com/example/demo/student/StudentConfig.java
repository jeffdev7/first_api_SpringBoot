package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository)
    {
        return args -> {
            //seeder
            Student john = new Student(
                    "John",
                    "John@gmail.com",
                    LocalDate.of(2000, Month.DECEMBER, 22)
            );
            Student anne = new Student(
                    "Anne",
                    "anne@outlook.com",
                    LocalDate.of(1995, Month.APRIL, 21)
            );
            Student james = new Student(
                    "James",
                    "james.27@outlook.com",
                    LocalDate.of(1990, Month.AUGUST, 11)
            );

            studentRepository.saveAll(
                    List.of(john, anne, james)
            );

        };
    }
}
