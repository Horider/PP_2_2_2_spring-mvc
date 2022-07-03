package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao {

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
    public List<Car> getCars(int count) {
        if (count == 0) {
            return listCars;
        }
        return listCars.stream().limit(count).collect(Collectors.toList());
    }
}
