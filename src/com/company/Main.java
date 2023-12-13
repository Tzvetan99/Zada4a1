package com.company;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<Car> carlist = new ArrayList<>();
        carlist.add(new Car("Tesla", "M5", 2018));
        carlist.add(new Car("Mercedes", "s", 2012));
        carlist.add(new Car("BMW", "M6", 2006));
        carlist.add(new Car("Mclaran", "Model Y", 2022));

        Collections.sort(carlist);

        for(Car car :carlist){
            car.drive();
        }

    }
}
