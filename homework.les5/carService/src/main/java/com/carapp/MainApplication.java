package com.carapp;

import com.carapp.model.Car;
import com.carapp.service.CarService;
import com.carapp.service.CarServiceImpl;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication {

  public static void main(String[] args) {

//    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
    ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfig.class);
    CarService carService = applicationContext.getBean("carService", CarService.class);
    List<Car> cars = carService.getAvailableCars();

    for(Car car : cars) {
      System.out.println(car);
    }
  }

}
