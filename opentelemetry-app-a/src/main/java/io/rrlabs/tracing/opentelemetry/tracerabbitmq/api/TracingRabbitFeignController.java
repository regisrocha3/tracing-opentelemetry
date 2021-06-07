package io.rrlabs.tracing.opentelemetry.tracerabbitmq.api;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/tracing-rabbitmq")
public class TracingRabbitFeignController {

    @Autowired private RabbitTemplate rabbitTemplate;

    @PostMapping("/{message}")
    public void save(@PathVariable("message") String message) {
        this.rabbitTemplate.convertAndSend(
                "topic.poc.exchange", "topic.poc.tracing.#", message);
    }

}
