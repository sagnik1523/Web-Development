package com.setterInjection;

public class Car {
    // So, specifications object is the dependency of the Car class
    // Spring will inject this object/bean/dependency
    private Specifications specifications;

    Car() {

    }
    // Now use setter i.e. pass the dependency/bean in the setter
    public void setSpecifications(Specifications specifications) {
        System.out.println("Setter called");
        this.specifications = specifications;
    }

    @Override
    public String toString() {
        return specifications.getMake() + " " + specifications.getModel();
    }
}
