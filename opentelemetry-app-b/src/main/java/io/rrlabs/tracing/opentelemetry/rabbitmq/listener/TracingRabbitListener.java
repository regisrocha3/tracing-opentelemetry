package io.rrlabs.tracing.opentelemetry.rabbitmq.listener;

import io.rrlabs.tracing.opentelemetry.mongodb.domain.TracingMongo;
import io.rrlabs.tracing.opentelemetry.mongodb.domain.service.TracingMongoService;
import io.rrlabs.tracing.opentelemetry.rabbitmq.config.TopicConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class TracingRabbitListener {

    @Autowired private TracingMongoService service;

    @RabbitListener(queues = { TopicConfig.TOPIC_DESTINATION_ONE })
    public void consumerTopic10(String message) {
        log.info("Consuming simple topic 1-0: " + message);
        this.service.save(TracingMongo.builder().data(message).build());
    }

    @RabbitListener(queues = { TopicConfig.TOPIC_DESTINATION_ONE })
    public void consumerTopic11(String message) {
        log.info("Consuming simple topic 1-1: " + message);
        this.service.save(TracingMongo.builder().data(message).build());
    }

    @RabbitListener(queues = { TopicConfig.TOPIC_DESTINATION_TWO })
    public void consumerTopic20(String message) {
        log.info("Consuming simple topic 2-0: " + message);
        this.service.save(TracingMongo.builder().data(message).build());
    }

    @RabbitListener(queues = { TopicConfig.TOPIC_DESTINATION_TWO })
    public void consumerTopic21(String message) {
        log.info("Consuming simple topic 2-1: " + message);
        this.service.save(TracingMongo.builder().data(message).build());
    }

    @RabbitListener(queues = { TopicConfig.TOPIC_DESTINATION_THREE })
    public void consumerTopic30(String message) {
        log.info("Consuming simple topic 3-0: " + message);
        this.service.save(TracingMongo.builder().data(message).build());
    }

    @RabbitListener(queues = { TopicConfig.TOPIC_DESTINATION_THREE })
    public void consumerTopic31(String message) {
        log.info("Consuming simple topic 3-1: " + message);
        this.service.save(TracingMongo.builder().data(message).build());
    }

}
