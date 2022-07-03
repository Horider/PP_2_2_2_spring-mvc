package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

import java.util.Optional;

@Controller
public class CarController {
    @Autowired
    CarService carService;

    @GetMapping("/cars")
    public String showCars(@RequestParam(value = "count") Optional<Integer> count, Model model) {
        model.addAttribute("cars", carService.getCars(count.orElse(0)));
        return "cars";
    }


//    @GetMapping("/cars")
//    public String printAllCars (ModelMap model) {
//        model.addAttribute("cars", carServiceImpl.allCars());
//        return "cars";
//    }

//    @GetMapping("/car/{carsCount}")
//    public String outputTheNumberOfMachines (@PathVariable("carsCount") int carsCount, ModelMap model) {
//        model.addAttribute("cars_numbers", carServiceImpl.listCars(carsCount));
//        return "cars_numbers";
//    }

}
