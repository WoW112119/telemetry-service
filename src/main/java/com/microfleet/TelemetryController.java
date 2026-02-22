package com.microfleet.telemetry_service;

import java.util.List;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/telemetry")
public class TelemetryController {

    private final TelemetryRepository repository;

    // Constructor Injection: Spring automatically provides the Repository here
    public TelemetryController(TelemetryRepository repository) {
        this.repository = repository;
    }

    // This is the "Inbox" for truck data
    @PostMapping
    public Telemetry receiveData(@RequestBody Telemetry data) {
        return repository.save(data);
    }

    // This lets us view all collected data
    @GetMapping
    public List<Telemetry> getAllData() {
        return repository.findAll();
    }
}