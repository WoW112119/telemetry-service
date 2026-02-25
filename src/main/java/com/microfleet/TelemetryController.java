package com.microfleet.telemetry_service;

import java.util.List;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/telemetry")
public class TelemetryController {

    private final TelemetryService service;

    // Constructor Injection: Spring automatically provides the Repository here
    public TelemetryController(TelemetryService service) {
        this.service = service;
    }

    // This is the "Inbox" for truck data
    @PostMapping
    public Telemetry receiveData(@RequestBody Telemetry data) {
        return service.processTelemetry(data);
    }

    // This lets us view all collected data
    @GetMapping
    public List<Telemetry> getAllData() {
        return service.getAllData();
    }

    @GetMapping("/violations")
    public List<Telemetry> getViolationsOnly() {
        return service.getViolations();
    }
}