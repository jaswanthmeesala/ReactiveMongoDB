package com.ust.subject.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.subject.Entity.Subject;
import com.ust.subject.Service.SubjectService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
// @RequestMapping("/")
public class SubjectController {

    @Autowired
    SubjectService subjectService;

    // Subject Endpoints
    @PostMapping("/subjects")
    public Mono<Subject> addSubject(@RequestBody Subject subject) {
        return subjectService.addSubject(subject);
    }

    @GetMapping("/subjects")
    public Flux<Subject> getAllSubjects() {
        return subjectService.getAllSubjects();
    }

}
