package com.itassistors.gaea.healthcheck;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckApi {
    @GetMapping(path = "/healthcheck")
    public HealthCheckModel healthCheck() {
        return new HealthCheckModel();
    }
}
