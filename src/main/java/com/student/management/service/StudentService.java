package com.student.management.service;
import com.student.management.model.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface StudentService {
    Page<Student> getAllStudents(Pageable pageable);
    Student getStudentById(Long id);
    Student saveStudent(Student student);
    void deleteStudent(Long id);
    List<Student> searchStudents(String keyword);
}
