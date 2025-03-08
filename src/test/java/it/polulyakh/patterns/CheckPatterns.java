package it.polulyakh.patterns;

import it.polulyakh.patterns.creational.abstract_fabric.DoorFactory;
import it.polulyakh.patterns.creational.abstract_fabric.IronDoorFactory;
import it.polulyakh.patterns.creational.abstract_fabric.WoodenDoorFactory;
import it.polulyakh.patterns.creational.builder.Person;
import it.polulyakh.patterns.creational.simple_fabric.Employee;
import it.polulyakh.patterns.creational.simple_fabric.EmployeeFactory;
import it.polulyakh.patterns.creational.simple_fabric.EmployeeType;
import it.polulyakh.patterns.creational.singleton.SimpleSingleton;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheckPatterns {

    @Test
    public void checkBuilder() {
        //Person можно создать только через builder, потому что констурктор private
        Person person = Person.builder()
                .firstName("Иван")
                .lastName("Иванов")
                .age(18)
                .build();

        assertEquals("Иванов", person.getLastName());
        assertEquals(18, person.getAge());
    }

    @Test
    public void checkSimpleFabric() {
        List<Employee> employees = new ArrayList<Employee>();
        //Создали фабрику
        EmployeeFactory employeeFactory = new EmployeeFactory();
        employees.add(employeeFactory.getEmployee(EmployeeType.MANAGER));
        employees.add(employeeFactory.getEmployee(EmployeeType.PROGRAMMER));
        employees.add(employeeFactory.getEmployee(EmployeeType.PROGRAMMER));
        employees.add(employeeFactory.getEmployee(EmployeeType.QA));
        for (Employee employee : employees) {
            employee.work();
        }
        assertEquals(4, employees.size());
    }

    @Test
    public void checkSingleton(){
        SimpleSingleton singleton = SimpleSingleton.getInstance();
        SimpleSingleton singleton2 = SimpleSingleton.getInstance();
        assertEquals(singleton, singleton2);
    }


    @Test
    public void checkAbstractFabric(){
        DoorFactory doorFactory = new IronDoorFactory();
        assertEquals("Железная дверь", doorFactory.createDoor().getDescription());
        assertEquals("Я мастер по железным дверям", doorFactory.createFittingExpert().doorFitting());

    }
}
