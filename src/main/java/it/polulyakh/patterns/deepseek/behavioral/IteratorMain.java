package it.polulyakh.patterns.deepseek.behavioral;



public class IteratorMain {

    public static void main(String[] args) {
        Book[] books = {
                new Book("1984", "Джордж Оруэлл"),
                new Book("Улисс", "Джеймс Джойс"),
                new Book("Старик и море", "Эрнест Хемингуэй"),
                new Book("Сто лет одиночества", "Габриэль Гарсиа Маркес"),
                new Book("Шум и ярость", "Уильям Фолкнер")
        };

        Bookshelf bookshelf = new Bookshelf(books);

        for(Book book : bookshelf) {
            System.out.println(book);
        }

    }
}
