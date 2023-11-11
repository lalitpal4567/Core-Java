package stream.streamProblems;

import java.util.ArrayList;
import java.util.List;

// Given a list of Book objects, filter out the books published before 2000,
// and then transform the remaining books to a list of their titles.
class Book{
    private String title;
    private int year;
    Book(String title, int year){
        this.title = title;
        this.year = year;
    }
    public String getTitle(){
        return this.title;
    }
    public int getYear(){
        return this.year;
    }
}

public class FilterAndMapWithCustomObject {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("Java Programming", 1998));
        books.add(new Book("Clean Code", 2008));
        books.add(new Book("Design Patterns", 1994));
        books.add(new Book("The Pragmatic Programmer", 1999));
        books.add(new Book("First head", 2000));
        books.add(new Book("OOPS", 2012));

        List<String> titles = books.stream()
                .filter(published -> published.getYear() < 2000)
                .map(Book::getTitle)
//                .map(book -> book.getTitle())     // valid
                .toList();

        titles.forEach(System.out::println);

    }
}
