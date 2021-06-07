package io.rrlabs.tracing.opentelemetry.mongodb.domain.service;

import io.rrlabs.tracing.opentelemetry.mongodb.domain.TracingMongo;
import io.rrlabs.tracing.opentelemetry.mongodb.domain.repository.TracingMongoRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class TracingMongoService {

    @Autowired private TracingMongoRepository repository;

    public void save(TracingMongo tracingMongo) {
        log.info("insert: {}", tracingMongo);
        this.repository.save(tracingMongo);
    }

    public List<TracingMongo> findAll() {
        return this.repository.findAll();
    }
}
