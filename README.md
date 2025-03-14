﻿# Паттерны JAVA

## 1. Строитель, он же Builder

Строитель относится к порождающим паттернам. Позволяет пошагово создавать сложные объекты. Используя один и тот же код можно получать различные представления объектов

**Проблема**
При построении сложного объекта со множеством полей для инициализации. В объекте может инициализированы либо все поля, либо только некоторые.

**Решение**

Паттерн строитель предлагает конструирование объекта отдельным объектом, который называется строителем
Конструируемый класс может содержать класс Builder внутри себя и предоставлять создание объекта через методы Builder.

Когда Строитель содержиться в отдельном классе, конструктор создаваемого класса не может быть private, потому что в Строителе понадобиться создавать объект конструируемого класса
Отсюда минус паттерна что много служебного кода для того, чтобы создать объект.



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
2. Для каждого класса продукта, создается класс создателя.


## 3. Абстрактная фабрика
Порождающий паттерн. Простыми словами это фабрика фабрик. 
Например, есть фабрика, которая упаковывает в коробку чашку, ложку, тарелку одного цвета.
И таких фабрик может быть сколько цветов на свете.
Клиент хочет открыть коробку и увидеть что все предметы одного цвета, а не разных, ну такая вот история.
Конкретная фабрика создает наборы определенных продуктов, в данном случае чайный сервиз. 
В коде использована другая аналогия с дверями, но суть осталась та же.

### 4. Singleton( Одиночка )
Гарантирует, что будет только один объект класса. Существует несколько модификаций синглтона.
Недостатки
- нарушает Single Responsibility Principle - принцип единственной ответственности, так как помимо полезной работы следит, чтобы объект был один
- Маскирует плохой дизайн
- Проблемы тестирования - нельзя сделать mock объект

### 5. Прототип ( Prototype)
Позволяет создавать новые объекты на основе имеющегося экземпляра (прототипа)
Применяется для клонирования объектов
В Java требуется реализация интерфейса Cloneable.
Если класс внутри имеет сложные типы переменных, для корректной работы во внутренних типах также надо реализовывать clone.

### 6. Адаптер ( Adapter )
Адаптер - преобразует интерфейс одного класса в интерфейс другого
Используется для того чтобы, существующие классы работали с другими без изменения исходного кода.

### 7. Мост( Bridge )
Мост - разделяет один или несколько классов на две отдельные иерархии - абстракцию и реализацию, позволяя изменить их независимо друг от друга

