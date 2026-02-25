# Sprint 2: Business Logic & Service Layer 🚛

### Key Features
* **Service Layer Pattern**: Refactored the architecture to separate web handling (Controller) from business logic (Service).
* **Safety Violation Logic**: Implemented a rule to automatically flag any truck exceeding the `MAX_SAFE_SPEED` (15.0 mph).
* **Clean Code Refactor**: Replaced "magic numbers" with a named constant for better maintainability.
* **Custom Reporting**: Developed a repository query to filter for high-speed violations.

### Technical Details
* Created `TelemetryService.java`.
* Updated `TelemetryRepository` with `findByHighSpeedViolationTrue()`.
* New Endpoint: `GET /api/telemetry/violations`.