package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import web.service.CarServiseImpl;


@Controller
public class CarController {
    @Autowired
    CarServiseImpl carServise = new CarServiseImpl();

    @GetMapping("/cars")
    public String printCars (ModelMap model){
        model.addAttribute("cars", carServise.listCars());
        return "car";
    }

    @GetMapping("/{id}")
    public String printNumberCars (@PathVariable ("id") int id, ModelMap model) {
        model.addAttribute("cars", carServise.number(id));
        return "car";
    }
}
