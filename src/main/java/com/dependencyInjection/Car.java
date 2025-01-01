package com.dependencyInjection;

public class Car {
    // So, specifications object is the dependency of the Car class
    // Spring will inject this object/bean/dependency
    private Specifications specifications;

    // It will make use of the below constructor as it read
    // on the config.xml file that the constructor argument
    // of car class must pass specification bean
    Car (Specifications specifications) {
        System.out.println("Constructor called");
        this.specifications = specifications;
    }

    public void setSpecifications(Specifications specifications) {
        this.specifications = specifications;
    }

    @Override
    public String toString() {
        return specifications.getMake() + " " + specifications.getModel();
    }
}
