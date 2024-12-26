package com.ust.student.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.student.Entity.Student;
import com.ust.student.Repository.StudentRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Mono<Student> addStudent(Student student){
        return studentRepository.save(student);
    }

    public Flux<Student> getStudentsByBatch(long batchid){
        return studentRepository.findByBatchId(batchid);
    }

    public Flux<Student> getAllStudents(){
        return studentRepository.findAll();
    }
}
