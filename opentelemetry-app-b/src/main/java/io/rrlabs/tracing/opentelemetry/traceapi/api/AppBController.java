package io.rrlabs.tracing.opentelemetry.traceapi.api;

import io.rrlabs.tracing.opentelemetry.traceapi.domain.service.ServiceTracing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppBController {
	
	@Autowired 
	private ServiceTracing service;
	
    @GetMapping("service")
    public String simpleTracing() {
        return service.method();
    }
}