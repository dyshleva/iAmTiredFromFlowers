package ua.edu.ucu.apps.demo.flowers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/flowers")
// annotation
public class FlowerController {
    private FlowerService flowerService;

    @Autowired
    public FlowerController(FlowerService flowerService) {
        this.flowerService = flowerService;
    }

    @GetMapping("/list")
    public List<Flower> getFlower() {
        return flowerService.getFlowers();
    }

    @PostMapping("/add")
    public void addFlower(@RequestBody Flower flower) {
        flowerService.add(flower);
    }
}
