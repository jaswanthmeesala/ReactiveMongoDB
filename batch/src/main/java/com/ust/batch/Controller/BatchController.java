package com.ust.batch.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.batch.Entity.Batch;
import com.ust.batch.Service.BatchService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
// @RequestMapping("/")
public class BatchController {
    @Autowired
    BatchService batchService;

    // Batch Endpoints
    @PostMapping("/batches")
    public Mono<Batch> addBatch(@RequestBody Batch batch) {
        return batchService.addBatch(batch);
    }

    @GetMapping("/batches")
    public Flux<Batch> getAllBatches() {
        return batchService.getAllBatches();
    }

    @GetMapping("/batches/subject/{subjectId}")
    public Flux<Batch> getBatchesBySubject(@PathVariable Long subjectId) {
        return batchService.getBatchesBySubject(subjectId);
    }

}
