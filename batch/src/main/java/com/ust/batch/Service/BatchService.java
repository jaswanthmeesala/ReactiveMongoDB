package com.ust.batch.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.batch.Entity.Batch;
import com.ust.batch.Repository.BatchRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class BatchService {
    @Autowired
    private BatchRepository batchRepository;

    public Mono<Batch> addBatch(Batch batch){
        return batchRepository.save(batch);
    }

    public Flux<Batch> getBatchesBySubject(Long subject_id){
        return batchRepository.findBySubjectId(subject_id);
    }

    public Flux<Batch> getAllBatches(){
        return batchRepository.findAll();
    }


    

}
