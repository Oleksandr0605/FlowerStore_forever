package ua.edu.ucu.apps.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(FlowerController.class, args);
    }
}
