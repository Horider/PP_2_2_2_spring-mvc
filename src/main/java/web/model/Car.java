package web.model;

import org.springframework.stereotype.Component;

@Component
public class Car {

    private String name;
    private int count;
    private int dateOfProduction;

    public Car() {
    }

    public Car(int count, String name, int dateOfProduction) {
        this.count = count;
        this.name = name;
        this.dateOfProduction = dateOfProduction;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
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
                ", series=" + count +
                ", dateOfProduction=" + dateOfProduction +
                '}';
    }
}
