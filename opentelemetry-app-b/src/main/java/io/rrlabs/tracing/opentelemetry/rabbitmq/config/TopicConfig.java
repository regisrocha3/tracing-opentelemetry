package io.rrlabs.tracing.opentelemetry.rabbitmq.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TopicConfig {
    /**
     * Nome do exchange
     */
    public static final String TOPIC_EXCHANGE = "topic.poc.exchange";

    /**
     * Nome do topic 1
     */
    public static final String TOPIC_DESTINATION_ONE = "topic.poc.tracing.one";

    /**
     * Nome do topic 2
     */
    public static final String TOPIC_DESTINATION_TWO = "topic.poc.tracing.two";

    /**
     * Nome do topic 3
     */
    public static final String TOPIC_DESTINATION_THREE = "topic.poc.tracing.three";

    /**
     * Nome do topic
     */
    public static final String ROUTER_KEY_TOPIC = "topic.poc.tracing.#";

    /**
     * Cria Bean queue
     *
     * @return Queue
     */
    @Bean
    public Queue topicDestinationOne() {
        return new Queue(TOPIC_DESTINATION_ONE, true);
    }

    /**
     * Cria Bean queue
     *
     * @return Queue
     */
    @Bean
    public Queue topicDestinationTwo() {
        return new Queue(TOPIC_DESTINATION_TWO, true);
    }

    /**
     * Cria Bean queue
     *
     * @return Queue
     */
    @Bean
    public Queue topicDestinationThree() {
        return new Queue(TOPIC_DESTINATION_THREE, true);
    }

    /**
     * Cria o Bean Topic Exchange
     *
     * @return TopicExchange
     */
    @Bean
    public TopicExchange simpleTopicExchange() {
        return new TopicExchange(TOPIC_EXCHANGE);
    }

    /**
     * @return Binding
     */
    @Bean
    public Binding bindingTopicDestinationOne() {
        return BindingBuilder.bind(this.topicDestinationOne()).to(this.simpleTopicExchange())
                .with(ROUTER_KEY_TOPIC);
    }

    /**
     * @return Binding
     */
    @Bean
    public Binding bindingTopicDestinationTwo() {
        return BindingBuilder.bind(this.topicDestinationTwo()).to(this.simpleTopicExchange())
                .with(ROUTER_KEY_TOPIC);
    }

    /**
     * @return Binding
     */
    @Bean
    public Binding bindingTopicDestinationThree() {
        return BindingBuilder.bind(this.topicDestinationThree()).to(this.simpleTopicExchange())
                .with(ROUTER_KEY_TOPIC);
    }
}
