package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarsDAO;
import web.model.Car;
import java.util.List;

@Service
public class CarServiseImpl implements CarService{
    @Autowired
    private CarsDAO carsDAO;

    @Override
    public List<Car> listCars() {
        return carsDAO.listCars;
    }

    @Override
    public Car number(int id) {
        return carsDAO.listCars.stream().filter(car -> car.getId() == id).
                findAny().orElse(null);
    }


}
