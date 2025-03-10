package it.polulyakh.patterns;

import it.polulyakh.patterns.creational.abstract_fabric.DoorFactory;
import it.polulyakh.patterns.creational.abstract_fabric.IronDoorFactory;
import it.polulyakh.patterns.creational.builder.Person;
import it.polulyakh.patterns.creational.prototype.Human;
import it.polulyakh.patterns.creational.prototype.Passport;
import it.polulyakh.patterns.creational.simple_fabric.Employee;
import it.polulyakh.patterns.creational.simple_fabric.EmployeeFactory;
import it.polulyakh.patterns.creational.simple_fabric.EmployeeType;
import it.polulyakh.patterns.creational.singleton.SimpleSingleton;
import it.polulyakh.patterns.structured.adapter.CardReader;
import it.polulyakh.patterns.structured.adapter.MemoryCard;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

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

    @Test
    public void checkPrototype() throws CloneNotSupportedException {
        Passport passport = new Passport("6304","3423525");
        Human human = new Human("Ваня", 18, passport);
        Human human2= human.clone();
        assertNotEquals(human2.getPassport(), human.getPassport());
    }


    @Test
    public void checkAdapter(){
        MemoryCard memoryCard = new MemoryCard();
        CardReader cardReader = new CardReader(memoryCard);
        cardReader.connectWithUsbCable();
    }
}
