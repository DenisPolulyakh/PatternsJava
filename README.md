﻿# Паттерны JAVA

## 1. Строитель, он же Builder

Строитель относится к порождающим паттернам. Позволяет пошагово создавать сложные объекты. Используя один и тот же код можно получать различные представления объектов

**Проблема**
При построении сложного объекта со множеством полей для инициализации. В объекте может инициализированы либо все поля,  либо только некоторые.

**Решение**

Паттерн строитель предлагает конструирование объекта отдельным объектом, который называется  строителем
Конструируемый класс может содержать класс Builder внутри себя и предоставлять создание объекта через методы Builder.

Когда Строитель содержиться в отдельном классе, конструктор создаваемого класса не может быть private, потому что в Строителе поадобиться создавать объект конструируемого класса
Отсюда минус паттерна что много службеного кода для того, чтобы создать объект.
[Пример паттерна, где Builder встроен внутрь создаваемого класса](/src/main/java/it/polulyakh/patterns/builder/Robot.java "Нажми чтобы открыть")  


## 2. Фабричный метод

Порождающий паттерн. Определяется общий интерфейс(абстрактный класс) для всех продуктов и общий интерфейс(абстрактный класс) фабрики, которая создает эти продукты. 
Для создания необходимо создать объект конкретного создателя, который вернет при создании конкретный продукт. Сначала кажется, что без этого паттерна не было проблем,
но при расширении задачи и добавлении нового продукта, мы просто реализуем интерфейс продукта и создаем класс фабрики для этого продукта.

Плюсы:
1. Выделяет создание объектов в одном месте
2. Упрощает добавление новый продуктов
3. Работа с созданными объектами ведется через интерфейс

Минусы:
1. Увеличивает объем кода, как обычно.
2. Для каждого класса продукта, создается класс создателя. Можно "нахуевертить" много одинаковых классов, если лень читать документацию или её тупо нет.

[Пример паттерна тут](/src/main/java/it/polulyakh/patterns/fabricmethod/FabricMethod.java)

Диаграмма классов  паттерна

![FabricMethod.jpg](src%2Fmain%2Fresources%2FFabricMethod.jpg)





