package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.util.Calendar.APRIL;
import static java.util.Calendar.MAY;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository){
        return args -> {
            Student esi = new Student(
                    "Esi",
                    "esi@gmail.com",
                    LocalDate.of(1994, APRIL, 02)
            );

            Student adjoa = new Student(
                    "Adjoa",
                    "adjoa@gmail.com",
                    LocalDate.of(2001, MAY, 05)
            );

            repository.saveAll(
                    List.of(esi, adjoa)
            );
        };
    }
}
