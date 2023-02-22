package com.dummy.workflowspringproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class WorkflowSpringProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(WorkflowSpringProjectApplication.class, args);
    }

    @GetMapping("/welcome")
    public String message() {
        return "Welcome";
    }

}
