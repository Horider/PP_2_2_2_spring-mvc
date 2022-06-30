package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private static int CARS_COUNT;
    private List<Car> listCars;
    {
        listCars = new ArrayList<>();
        listCars.add(new Car(++CARS_COUNT, "Audi", 1991));
        listCars.add(new Car(++CARS_COUNT, "BMW", 1992));
        listCars.add(new Car(++CARS_COUNT, "OKA", 1993));
        listCars.add(new Car(++CARS_COUNT, "Lada", 1994));
        listCars.add(new Car(++CARS_COUNT, "Mazda", 1995));
    }

    @Override
    public List<Car> allCars() {
        return listCars;
    }

    @Override
    public Car getCatByNumber (int id) {
        return listCars.stream().filter(car -> car.getId() == id).findAny().orElse(null);
    }


}
