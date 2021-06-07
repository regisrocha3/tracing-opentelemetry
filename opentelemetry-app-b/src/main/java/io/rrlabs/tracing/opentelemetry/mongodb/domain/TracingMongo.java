package io.rrlabs.tracing.opentelemetry.mongodb.domain;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@Document("tracing-mongo")
public class TracingMongo {
    @Id
    private String id;
    private String data;
}
