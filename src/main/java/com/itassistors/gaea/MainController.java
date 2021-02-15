package com.itassistors.gaea;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @GetMapping("/")
    public String rootPath() {
        return "Gaea";
    }
}
