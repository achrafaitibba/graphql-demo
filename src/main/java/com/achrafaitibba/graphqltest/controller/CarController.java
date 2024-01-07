package com.achrafaitibba.graphqltest.controller;

import com.achrafaitibba.graphqltest.model.Car;
import com.achrafaitibba.graphqltest.service.CarService;
import lombok.AllArgsConstructor;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@AllArgsConstructor
public class CarController {
    private final CarService carService;


    @QueryMapping
    public List<Car> getAll(){
        return carService.getAll();
    }
}
