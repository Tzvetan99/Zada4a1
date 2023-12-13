package com.company;

public class Car extends Vehicle implements Comparable<Car>{
        private String make;
        public String model;
        public int year;

        public Car(String make, String model, int year ){
            this.setMake(make);
            this.model = model;
            this.year = year;
        }


    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public void drive() {
        System.out.println("drawingcar" + this);
    }

    @Override
    public int compareTo(Car o) {
        return this.year -o.year;
    }

    @Override
    public String toString() {
        return "Car" + make +"model:"+model+ "year" + year;
    }

}





