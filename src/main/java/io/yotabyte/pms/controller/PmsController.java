package io.yotabyte.pms.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PmsController {

    @GetMapping()
    public String sayHello() {
        return "Hello from PMS Services";
    }

}
