package com.itassistors.gaea.healthcheck;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckModel {
    private String os;
    private String status;

    public HealthCheckModel() {
        this.os = System.getProperty("os.name");
        this.status = "PASS";
    }

    public HealthCheckModel(String os, String status) {
        this.os = os;
        this.status = status;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
