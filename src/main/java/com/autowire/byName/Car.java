package com.autowire.byName;

public class Car
{
    private Specification specification;

    public void setSpecification(Specification specification)
    {
        this.specification = specification;
    }

    @Override
    public String toString()
    {
        return specification.getMake() + " " + specification.getModel();
    }
}
