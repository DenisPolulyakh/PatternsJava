package it.polulyakh.patterns.creational.simple_fabric;

/**
 * Фабрика производит разные объекты, но все объекты являются наследниками класса
 * которые может производить фабрика
 */
public class EmployeeFactory {
    public  Employee getEmployee(EmployeeType type){
        switch(type){
            case MANAGER: return new Manager();
            case PROGRAMMER: return new Programmer();
            case QA:return new QAEngineer();
            default: return null;
        }
    }
}
