package web.service;

import web.model.Car;
import java.util.List;

public interface CarService {

    Car number(int id);

    List<Car> listCars();
}
