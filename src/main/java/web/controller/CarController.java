package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import web.service.CarServiceImpl;

@Controller
public class CarController {

    private final CarServiceImpl carServiceImpl;

    public CarController(CarServiceImpl carServiceImpl) {
        this.carServiceImpl = carServiceImpl;
    }

    @GetMapping("/cars")
    public String printAllCars (ModelMap model) {
        model.addAttribute("cars", carServiceImpl.allCars());
        return "all_cars";
    }

    @GetMapping("/{id}")
    public String outputTheNumberOfMachines (@PathVariable("id") int id, ModelMap model) {
        model.addAttribute("carsonnumbers", carServiceImpl.getCatByNumber(id));
        return "cars_numbers";
    }
}
