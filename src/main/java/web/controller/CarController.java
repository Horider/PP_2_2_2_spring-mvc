package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import web.service.CarServiceImpl;

@Controller
public class CarController {
    @Autowired
    CarServiceImpl carServiceImpl;

    @GetMapping("/cars")
    public String printAllCars (ModelMap model) {
        model.addAttribute("cars", carServiceImpl.allCars());
        return "all_cars";
    }

    @GetMapping("/car/{carsCount}")
    public String outputTheNumberOfMachines (@PathVariable("carsCount") int carsCount, ModelMap model) {
        model.addAttribute("cars_numbers", carServiceImpl.listCars(carsCount));
        return "cars_numbers";
    }

}
