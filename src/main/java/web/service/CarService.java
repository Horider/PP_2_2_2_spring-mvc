package web.service;

import web.model.Car;

import java.util.List;

public interface CarService {

    Car getCatByNumber(int id);

    List<Car> allCars();
}
