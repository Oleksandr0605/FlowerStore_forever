package ua.edu.ucu.apps.spring.delivery;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
@RequestMapping("/api/delivery")
public class PostDeliveryStrategy implements Delivery {
    @Override
    @GetMapping("/post")
    public String deliver() {
        return "Delivering by post";
    }
}
