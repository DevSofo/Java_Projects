package com.devsofo.srbapplication.service;

import com.devsofo.srbapplication.exception.StudentAlreadyExistsException;
import com.devsofo.srbapplication.exception.StudentNotFoundException;
import com.devsofo.srbapplication.model.Student;
import com.devsofo.srbapplication.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService implements IStudentService {

    private final StudentRepository studentRepository;

    @Override
    public Student addStudent(Student student) {
        if(studentAlreadyExists(student.getEmail())) {
            throw new StudentAlreadyExistsException(student.getEmail()+"Student already exists");
        }
        return studentRepository.save(student);
    }

    @Override
    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student updateStudent(Student student) {
        return null;
    }

    @Override
    public Student updateStudent(Student student, Long id) {
        return studentRepository.findById(id).map(st -> {
            student.setFirstName(student.getFirstName());
            student.setLastName(student.getLastName());
            student.setEmail(student.getEmail());
            student.setDepartment(student.getDepartment());
            return studentRepository.save(st);
        }).orElseThrow(() -> new StudentNotFoundException("Student not found with id " + id));
    }

    @Override
    public Student getStudentById(Long id) {
        return studentRepository.findById(id)
                .orElseThrow(() -> new StudentNotFoundException("Student not found with id " + id));
    }

    @Override
    public void deleteStudent(Long id) {
        if(!studentRepository.existsById(id)) {
            throw new StudentNotFoundException("Student not found with id " + id);
        }

    }
    private boolean studentAlreadyExists(String email) {
        return studentRepository.findByEmail(email).isPresent();
    }
}
