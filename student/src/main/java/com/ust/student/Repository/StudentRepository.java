package com.ust.student.Repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.ust.student.Entity.Student;

import reactor.core.publisher.Flux;

@Repository
public interface StudentRepository extends ReactiveMongoRepository<Student,Long>{
    Flux<Student> findByBatchId(long batchid);

}
