package ua.edu.ucu.apps.spring.payment;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/api/payment")
public class PayPalPaymentStrategy implements Payment {
    @Override
    @GetMapping("/paypal")
    public String pay() {
        return "Paying 'price' using PayPal";
    }
}
