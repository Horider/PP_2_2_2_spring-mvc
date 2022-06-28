package web.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarsDAO {

    @Autowired
    Car car = new Car();
    private static int CARS_COUNT;
    public List<Car> listCars;

    {
        listCars = new ArrayList<>();
        listCars.add(new Car(++CARS_COUNT, "Audi", 1991));
        listCars.add(new Car(++CARS_COUNT, "BMW", 1992));
        listCars.add(new Car(++CARS_COUNT, "OKA", 1993));
        listCars.add(new Car(++CARS_COUNT,"Lada", 1994));
        listCars.add(new Car(++CARS_COUNT,"Mazda", 1995));
    }


}
