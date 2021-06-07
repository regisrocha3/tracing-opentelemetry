package io.rrlabs.tracing.opentelemetry.traceapi.domain.service;

import io.rrlabs.tracing.opentelemetry.traceapi.domain.repository.TestEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceTracing {

    @Autowired private TestEntityRepository repository;

    public String method() {
        this.repository.findAll();
        return "Tracing";
    }
}
