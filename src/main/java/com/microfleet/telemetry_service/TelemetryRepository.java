package com.microfleet.telemetry_service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface TelemetryRepository extends JpaRepository<Telemetry, Long> {
    // By extending JpaRepository, Spring Boot writes the SQL for you!

    // Just the type and the method name
List<Telemetry> findByHighSpeedViolationTrue();
}