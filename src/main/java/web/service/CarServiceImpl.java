package web.service;

import web.model.Car;
import java.util.List;

public class CarServiceImpl implements CarService {
    private List<Car> cars = List.of(
            new Car(123, "Toyota", "red"),
            new Car(456, "Ford", "white"),
            new Car(789, "Lada", "green"),
            new Car(401, "Mercedes", "black"),
            new Car(712, "Niva", "yellow"));

    @Override
    public List<Car> getCars(Integer count) {
        if (count == null || count >= cars.size()) {
            return cars;
        }
        return cars.subList(0, count);
    }
}
