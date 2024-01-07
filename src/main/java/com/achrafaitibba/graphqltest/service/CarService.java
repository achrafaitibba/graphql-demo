package com.achrafaitibba.graphqltest.service;

import com.achrafaitibba.graphqltest.model.Brand;
import com.achrafaitibba.graphqltest.model.Car;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@Service
public class CarService {

    private AtomicInteger atomicInteger = new AtomicInteger();
    private List<Car> allCars = new ArrayList<>();


    public List<Car> getAll(){
        return allCars;
    }

    public Car getCar(Integer id){
        Car toReturn = null;
        for(Car c :allCars){
            if (c.id() == id){
                toReturn = c;
                break;
            }
        }
        return toReturn;
    }

    @PostConstruct
    public void createCars(){
        allCars.add(new Car(atomicInteger.get(), Brand.BWM, "m4"));
        allCars.add(new Car(atomicInteger.get(), Brand.AUDI, "rs6"));
        allCars.add(new Car(atomicInteger.get(), Brand.MERCEDES, "g63"));
        allCars.add(new Car(atomicInteger.get(), Brand.PORSHE, "panamera"));
    }
}
