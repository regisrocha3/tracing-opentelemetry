package io.rrlabs.tracing.opentelemetry.traceapi.domain.repository;

import io.rrlabs.tracing.opentelemetry.traceapi.domain.TestEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestEntityRepository extends JpaRepository<TestEntity, Long> {
}