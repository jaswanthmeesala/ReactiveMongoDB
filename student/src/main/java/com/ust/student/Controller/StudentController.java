package com.ust.student.Controller;

// import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.student.Entity.Student;
import com.ust.student.Service.StudentService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
// @RequestMapping("/")
public class StudentController {

    @Autowired
    private StudentService studentService;

    // @Autowired
    // private BatchService batchService;

    // Student Endpoints
    @PostMapping("/students")
    public Mono<Student> addStudent(@RequestBody Student student) {
        return studentService.addStudent(student);
    }

    @GetMapping("/students")
    public Flux<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping("/students/batch/{batchid}")
    public Flux<Student> getStudentsByBatch(@PathVariable Long batchid) {
        return studentService.getStudentsByBatch(batchid);
    }

    // @GetMapping("/students/by-batch")
    // public Flux<Map<String, Flux<Student>>> getStudentsGroupedByBatch() {
    //     return batchService.getAllBatches()
    //         .flatMap(batch -> studentService.getStudentsByBatch(batch.getId())
    //             .collectList()
    //             .map(students -> Map.of(batch.getName(), Flux.fromIterable(students)))
    //         );
    // }

}
