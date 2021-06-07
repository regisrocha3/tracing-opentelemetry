package io.rrlabs.tracing.opentelemetry.tracefeign.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(value = "TracingMongoClient", url = "http://opentelemetry-app-b:9082", decode404 = true)
public interface TracingMongoClient {

    @PostMapping("/tracing-mongo")
    void sendTracing();
}
