package ua.edu.ucu.apps.spring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ua.edu.ucu.apps.spring.flowers.Flower;
import ua.edu.ucu.apps.spring.flowers.FlowerService;

@RestController
@SpringBootApplication
@RequestMapping("/api/flowers")
public class FlowerController {
    private FlowerService flowerService;

    @Autowired
    public FlowerController(FlowerService flowerService) {
        this.flowerService = flowerService;
    }


    @GetMapping("/list")
    public List<Flower> floweString() {
          return List.of(new Flower());
    }

    @PostMapping("/add")
    public void add(@RequestBody Flower flower) {
        flowerService.add(flower);
    }
}
