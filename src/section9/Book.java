package section9;

import java.util.ArrayList;

public class Book {
    private String isbn;
    private String title;
    private ArrayList<String> authors;
    private int edition;
    private int pages;
    private double price;
    public Book () {
        authors = new ArrayList<String>();
        title = "No Title Yet";
    }

    public Book (String isbn, String title, int edition) {
        authors = new ArrayList<String>();
        this.isbn = isbn;
        this.title = title;
        this.edition = edition;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public int getEdition() {
        return edition;
    }

    public int getPages() {
        return pages;
    }

    public double getPrice() {
        return price;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void addAuthor(String authorName){
        authors.add(authorName);
    }

    public void removeAuthor(String authorName) {
        authors.remove(authorName);
//        int i;
//        for (i = 0; i < authors.size(); ++i){
//            if (authors.get(i).equals(authorName)) {
//                authors.remove(i);
//            }
//        }
    }

    public void changeAuthor(String currAuthor, String newAuthor) {
        int index = authors.indexOf(currAuthor); // indexOf returns -1 if it's not found
        if (index != -1) {
            authors.set(index, newAuthor);
        }
    }
    @Override
    public String toString() {
        String authorsString = String.join(", ", authors);
        return "Title: " + title + "\n" +
                "Edition: " + edition + "\n" +
                "ISBN: " + isbn + "\n" +
                "Authors: " + authorsString + "\n" +
                "Pages: " + pages + "\n" +
                "Price: " + price;
    }

}
