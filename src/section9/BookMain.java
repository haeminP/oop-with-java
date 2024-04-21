package section9;

import java.util.ArrayList;
import java.util.Scanner;

public class BookMain {

    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<Book>();
        Book book1 = new Book();
        book1.setTitle("War and Peace");
        book1.addAuthor("Tolstoy");
        book1.setPages(250);
        book1.setPrice(99.85);
        books.add(book1);

        Book book2 = new Book("123483492", "The Hunchback", 2);
        book2.addAuthor("Victor Hugo");
        book2.setPages(0);
        book2.setPrice(120.0);
        books.add(book2);
        
        book2.addAuthor("Haemin");
        book2.changeAuthor("Haemin", "Fabio");

        for (Book book : books) {
            System.out.println(book.toString());
            System.out.println("---------------");
        }

        TextBook textbook1 = new TextBook();
        textbook1.setTitle("Big Java");
        textbook1.setEdition(5);
        textbook1.setIsbn("329501610492");
        textbook1.addAuthor("Horstmann");
        textbook1.setPages(983);
        textbook1.setPrice(85.0);
        textbook1.setSubject("Computer Science");
        textbook1.setEbook(true);
        textbook1.seteBookPrice(50.0);
        System.out.println(textbook1.toString());



    }
}
