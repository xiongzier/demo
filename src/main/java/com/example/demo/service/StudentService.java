package com.example.demo.service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Optional<Student> getStudentById(Long id) {
        return studentRepository.findById(id);
    }

    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }

    public Student updateStudent(Long id, Student studentDetails) {
        Student student = studentRepository.findById(id).orElse(null);
        if (student != null) {
            student.setSname(studentDetails.getSname());
            student.setSno(studentDetails.getSno());
            student.setSage(studentDetails.getSage());
            studentRepository.save(student);
        }
        return student;
    }

    public Student getStudentBySname(String sname) {
        return studentRepository.findBySname(sname);
    }

    public void deleteStudents(List<Long> ids) {
        ids.forEach(id -> studentRepository.deleteById(id));
    }
}
