package ua.edu.ucu.apps.spring.delivery;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/api/delivery")
public class DHLDeliveryStrategy implements Delivery {
    @Override
    @GetMapping("/dhl")
    public String deliver() {
        return ("Delivering by DHL");
    }
}
