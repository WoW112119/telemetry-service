package com.microfleet.telemetry_service;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TelemetryService {

    private final TelemetryRepository repository;

    public TelemetryService(TelemetryRepository repository) {
        this.repository = repository;
    }

    public Telemetry processTelemetry(Telemetry data) {
        // Business Logic: Flag if truck exceeds safety limit of 15mph
        if (data.getSpeed() != null && data.getSpeed() > 15.0) {
            data.setHighSpeedViolation(true);
        } else {
            data.setHighSpeedViolation(false);
        }
        
        return repository.save(data);
    }
    public List<Telemetry> getAllData() {
        return repository.findAll();
    }
}