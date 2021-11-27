package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class userService {
    private List<Car> carList = initCarList();

    public List<Car> initCarList() {
        carList = new ArrayList<>();

        carList.add(new Car("Audi", (short) 2000, "red"));
        carList.add(new Car("Toyota", (short) 1998, "green"));
        carList.add(new Car("Lada", (short) 2007, "purple"));
        carList.add(new Car("Kia", (short) 2003, "silver"));
        carList.add(new Car("Lexus", (short) 2010, "carrot"));
        return carList;
    }

    public List<Car> getCarList(Integer count) {
        List<Car> countedCar = new ArrayList<>();
        for(int i = 0; i<count; i++) {
            if (count >= 5) {
                countedCar = carList;
                break;
            }
            countedCar.add(carList.get(i));
        }
        return countedCar;
    }
}
