package com.ust.batch.Repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.ust.batch.Entity.Batch;

import reactor.core.publisher.Flux;

@Repository
public interface BatchRepository extends ReactiveMongoRepository<Batch,Long>{
    Flux<Batch> findBySubjectId(Long subjectid);

}
