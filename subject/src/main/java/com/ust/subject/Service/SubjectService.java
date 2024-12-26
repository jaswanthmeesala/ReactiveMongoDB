package com.ust.subject.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.subject.Entity.Subject;
import com.ust.subject.Repository.SubjectRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class SubjectService {
    @Autowired
    private SubjectRepository subjectRepository;

    public Mono<Subject> addSubject(Subject subject){
        return subjectRepository.save(subject);
    }

    public Flux<Subject> getAllSubjects(){
        return subjectRepository.findAll();
    }
    
}
