package com.ust.subject.Repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.ust.subject.Entity.Subject;


@Repository
public interface SubjectRepository extends ReactiveMongoRepository<Subject,Long>{
    
}
