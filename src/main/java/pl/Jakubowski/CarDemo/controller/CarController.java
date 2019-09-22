package pl.Jakubowski.CarDemo.controller;

import org.springframework.web.bind.annotation.*;
import pl.Jakubowski.CarDemo.model.CarModel;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/cars")
public class CarController {
    private List<CarModel> carModelList;

    public CarController() {
        carModelList = new ArrayList<>();
        carModelList.add(new CarModel(1L, "Ford", "Focus", "niebieski", "sedan", 19.569, java.time.LocalDate.of(2009, 05, 23)));
        carModelList.add(new CarModel(2L, "BMW", "jakis", "czarny", "combi", 25.768, java.time.LocalDate.of(2016, 12, 02)));
    }

    @GetMapping("/all")
    public List<CarModel> getCarModelList() {
        return carModelList;
    }

    @PostMapping
    public boolean addCar (@RequestBody CarModel carModel){
        return carModelList.add(carModel);
    }
}
