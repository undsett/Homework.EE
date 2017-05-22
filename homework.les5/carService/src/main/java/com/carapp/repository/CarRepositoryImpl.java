package com.carapp.repository;

import com.carapp.model.Car;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository("carRepository")
public class CarRepositoryImpl implements CarRepository{

  public List<Car> getCars() {
    List<Car> cars = new ArrayList<Car>();

    Car car1 = new Car("BMW", "X5", 2005);
    Car car2 = new Car("Dodge", "Charger", 1969);

    cars.add(car1);
    cars.add(car2);

    return cars;
  }
}
