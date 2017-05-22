package com.carapp.service;

import com.carapp.model.Car;
import com.carapp.repository.CarRepository;
import com.carapp.repository.CarRepositoryImpl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("carService")
public class CarServiceImpl implements CarService {

  @Autowired
  CarRepository carRepository;

  public List<Car> getAvailableCars() {
    return carRepository.getCars();
  }

  public void setCarRepository(CarRepository carRepository) {
    this.carRepository = carRepository;
  }

  public CarServiceImpl(CarRepository carRepository) {
    this.carRepository = carRepository;
  }

  public CarServiceImpl() {

  }
}
