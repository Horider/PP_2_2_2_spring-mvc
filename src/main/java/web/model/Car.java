package web.model;

import org.springframework.stereotype.Component;
@Component
public class Car {

    private String name;
    private int id;
    private int dateOfProduction;

    public Car() {
    }

    public Car(int id, String name, int dateOfProduction) {
        this.id = id;
        this.name = name;
        this.dateOfProduction = dateOfProduction;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
                ", series=" + id +
                ", dateOfProduction=" + dateOfProduction +
                '}';
    }
}
