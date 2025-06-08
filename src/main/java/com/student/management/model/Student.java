package com.student.management.model;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentId;

    @NotBlank(message = "Name is required")
    private String name;

    @Min(value = 3)
    @Max(value = 100)
    private int age;

    @NotBlank(message = "Class is required")
    private String className;

    @Email(message = "Invalid email")
    private String email;

    @NotBlank(message = "Address is required")
    private String address;

    // Getters and setters
}
