package com.componentScan;
import org.springframework.stereotype.Component;

@Component("employee")
public class Employee {
    private Integer employeeID;
    private Integer employeeSalary;
    private String employeeName;

    public Integer getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(Integer employeeID) {
        this.employeeID = employeeID;
    }

    public Integer getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(Integer employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeID=" + employeeID +
                ", employeeSalary=" + employeeSalary +
                ", employeeName='" + employeeName + '\'' +
                '}';
    }
}
