package com.microfleet.telemetry_service;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import lombok.Data;

@Entity
@Data // This is "Lombok" - it automatically writes your getters/setters!
public class Telemetry {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String truckId;
    private Double speed;
    private Integer battery;
    private LocalDateTime timestamp = LocalDateTime.now();
    private boolean highSpeedViolation;
}