package web.services;

import org.springframework.web.bind.annotation.RequestMapping;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImp implements CarService {

    Car car1 = new Car("Toyota", 1,"red");
    Car car2 = new Car("Mazda", 2,"blue");
    Car car3 = new Car("BMW", 3,"green");
    Car car4 = new Car("NISSAN", 4,"black");
    Car car5 = new Car("LEXUS", 5,"white");

    private ArrayList<Car> cars = new ArrayList<>();
    {
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
    }


    @Override
    public List<Car> getCar(Integer carCount) {
        List<Car>carsToUser = (List<Car>) cars.clone();
        if (carCount < 5) {
            while (carsToUser.size() != carCount) {
                carsToUser.remove(0);
            }
        }
        return carsToUser;
    }
}
