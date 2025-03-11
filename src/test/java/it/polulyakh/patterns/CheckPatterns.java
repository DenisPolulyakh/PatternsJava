package it.polulyakh.patterns;

import it.polulyakh.patterns.behavioral.chain.Handler;
import it.polulyakh.patterns.behavioral.chain.Order;
import it.polulyakh.patterns.behavioral.chain.Repeater;
import it.polulyakh.patterns.behavioral.chain.Taxi;
import it.polulyakh.patterns.behavioral.observer.Channel;
import it.polulyakh.patterns.behavioral.observer.NewsChannel;
import it.polulyakh.patterns.behavioral.observer.NewsPortal;
import it.polulyakh.patterns.behavioral.template.OK;
import it.polulyakh.patterns.behavioral.template.SocialNetwork;
import it.polulyakh.patterns.behavioral.template.VK;
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
import it.polulyakh.patterns.structured.decorator.SimpleCar;
import it.polulyakh.patterns.structured.decorator.SportCar;
import it.polulyakh.patterns.structured.facade.ShapeFacade;
import it.polulyakh.patterns.structured.proxy.CurrencyRateService;
import it.polulyakh.patterns.structured.proxy.CurrencyRateServiceProxy;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Currency;
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
    public void checkSingleton() {
        SimpleSingleton singleton = SimpleSingleton.getInstance();
        SimpleSingleton singleton2 = SimpleSingleton.getInstance();
        assertEquals(singleton, singleton2);
    }


    @Test
    public void checkAbstractFabric() {
        DoorFactory doorFactory = new IronDoorFactory();
        assertEquals("Железная дверь", doorFactory.createDoor().getDescription());
        assertEquals("Я мастер по железным дверям", doorFactory.createFittingExpert().doorFitting());

    }

    @Test
    public void checkPrototype() throws CloneNotSupportedException {
        Passport passport = new Passport("6304", "3423525");
        Human human = new Human("Ваня", 18, passport);
        Human human2 = human.clone();
        assertNotEquals(human2.getPassport(), human.getPassport());
    }


    @Test
    public void checkAdapter() {
        MemoryCard memoryCard = new MemoryCard();
        CardReader cardReader = new CardReader(memoryCard);
        cardReader.connectWithUsbCable();
    }

    @Test
    public void checkDecorator() {
        SimpleCar simpleCar = new SimpleCar();
        assertEquals(100, simpleCar.getSpeed());
        SportCar sportCar = new SportCar(simpleCar);
        assertEquals(150, sportCar.getSpeed());
    }

    @Test
    public void checkFacade() {
        ShapeFacade shapeFacade = new ShapeFacade();
        assertEquals("Circle drawing...", shapeFacade.draw("CIRCLE"));
        assertEquals("Unknown shape", shapeFacade.draw("big dick"));

    }

    @Test
    public void checkProxy() {
        Currency currency = Currency.getInstance("USD");
        CurrencyRateService currencyRateService = new CurrencyRateServiceProxy();
        double firstRequestRate = currencyRateService.getDailyCurrencyRate(currency);
        System.out.println(firstRequestRate);
        assertEquals(firstRequestRate, currencyRateService.getDailyCurrencyRate(currency));
        assertEquals(firstRequestRate, currencyRateService.getDailyCurrencyRate(currency));
        assertEquals(firstRequestRate, currencyRateService.getDailyCurrencyRate(currency));
    }

    @Test
    public void checkChain() {
        Handler handler = new Repeater();
        handler.bind(new Taxi("С456УК88"))
                .bind(new Taxi("С457УК88"))
                .bind(new Taxi("С458УК88"))
                .bind(new Taxi("С459УК88"))
                .bind(new Taxi("С460УК88"))
                .bind(handler);
        Order  order = new Order("#1");
        handler.handle(order);
    }


    @Test
    public void checkTemplate(){
        SocialNetwork socialNetwork = new VK("ivan","sdf32423");
        socialNetwork.createPost("Котята мяукают");
        socialNetwork = new OK("ivan","1342r4df");
        socialNetwork.createPost("Утки крякают");
    }

    @Test
    public void checkObserver(){
        Channel channelWolf = new NewsChannel("Cерый волк");
        Channel threePig = new NewsChannel("Три поросенка");
        NewsPortal portal = new NewsPortal();
        portal.add(channelWolf);
        portal.add(threePig);
        portal.sendNews("Правительство расширяет программу ипотеки на дома из листьев, но на дома из кирпичей это не распространяется");

    }
}
