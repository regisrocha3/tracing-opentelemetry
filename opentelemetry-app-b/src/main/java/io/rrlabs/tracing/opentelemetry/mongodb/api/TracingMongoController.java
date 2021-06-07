package io.rrlabs.tracing.opentelemetry.mongodb.api;

import io.rrlabs.tracing.opentelemetry.mongodb.domain.TracingMongo;
import io.rrlabs.tracing.opentelemetry.mongodb.domain.service.TracingMongoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/tracing-mongo")
public class TracingMongoController {

    @Autowired private TracingMongoService service;

    @PostMapping
    public void save() {
        service.save(TracingMongo.builder().data(UUID.randomUUID().toString()).build());
    }

    @GetMapping
    public List<TracingMongo> findAll() {
        return service.findAll();
    }

}
