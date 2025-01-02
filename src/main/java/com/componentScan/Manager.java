package com.componentScan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("manager")
public class Manager
{
    private Employee employee;

    @Autowired
    public Manager(Employee employee)
    {
        // So spring would search for bean of type Employee
        // And when got then done
        this.employee = employee;
    }

    public void setEmployee(Employee employee)
    {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "employee=" + employee +
                '}';
    }
}
