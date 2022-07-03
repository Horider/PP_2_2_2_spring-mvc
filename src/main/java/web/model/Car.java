package web.model;

import org.springframework.stereotype.Component;

@Component
public class Car {

    private String name;
    private int carsCount;
    private int dateOfProduction;

    public Car() {
    }

    public Car(int carsCount, String name, int dateOfProduction) {
        this.carsCount = carsCount;
        this.name = name;
        this.dateOfProduction = dateOfProduction;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCarsCount() {
        return carsCount;
    }

    public void setCarsCount(int carsCount) {
        this.carsCount = carsCount;
    }

    public int getDateOfProduction() {
        return dateOfProduction;
    }

    public void setDateOfProduction(int dateOfProduction) {
        this.dateOfProduction = dateOfProduction;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", series=" + carsCount +
                ", dateOfProduction=" + dateOfProduction +
                '}';
    }
}
