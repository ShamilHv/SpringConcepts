package com.example.autowire.name;

public class Car {

    private Specification specification;

    public void displayDetails(){
        System.out.println("Car details :"+ specification.toString());
    }

    public void setSpecification(Specification specification) {
        this.specification = specification;
    }
}

