package io.rrlabs.tracing.opentelemetry.tracefeign.api;

import io.rrlabs.tracing.opentelemetry.tracefeign.client.TracingMongoClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/tracing-feign")
public class TracingMongoFeignController {

    @Autowired private TracingMongoClient client;

    @PostMapping
    public void save() {
        this.client.sendTracing();
    }

    /*@GetMapping
    public void findAll() {
        this.client.sendTracing();
    }*/
}
