package it.polulyakh.patterns.deepseek.behavioral;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Bookshelf implements Iterable<Book> {

    private Book[] books;



    public Bookshelf(Book[] books) {
        this.books = books;

    }




    @Override
    public Iterator<Book> iterator() {
        return new ReverseBookIterator();
    }


    private class ReverseBookIterator implements Iterator<Book> {


        private int index = books.length - 1;


        @Override
        public boolean hasNext() {
           return index >= 0;
        }

        @Override
        public Book next() {
            if(!hasNext()){
                throw new NoSuchElementException();
            }
            Book book = books[index];
            index = index - 1;
            if (index < 0) {
                index = -1;
            }
            return book;
        }
    }


}
