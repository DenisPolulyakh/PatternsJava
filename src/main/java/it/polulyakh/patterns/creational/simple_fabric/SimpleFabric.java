package it.polulyakh.patterns.creational.simple_fabric;

import java.util.ArrayList;
import java.util.List;

public class SimpleFabric {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<Employee>();
        //Создали фабрику
        EmployeeFactory employeeFactory = new EmployeeFactory();
        employees.add(employeeFactory.getEmployee(EmployeeType.MANAGER));
        employees.add(employeeFactory.getEmployee(EmployeeType.PROGRAMMER));
        employees.add(employeeFactory.getEmployee(EmployeeType.PROGRAMMER));
        employees.add(employeeFactory.getEmployee(EmployeeType.QA));
        for(Employee employee : employees) {
            employee.work();
        }

    }
}
