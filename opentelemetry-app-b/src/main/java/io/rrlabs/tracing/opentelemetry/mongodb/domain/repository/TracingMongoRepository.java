package io.rrlabs.tracing.opentelemetry.mongodb.domain.repository;

import io.rrlabs.tracing.opentelemetry.mongodb.domain.TracingMongo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TracingMongoRepository extends MongoRepository<TracingMongo, String> {
}
