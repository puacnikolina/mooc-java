package org.example.part4.two;

public class Book {

    private String title;
    private String pages;
    private String publicationYear;

    public Book(String title, String pages, String publicationYear){
        this.title = title;
        this.pages = pages;
        this.publicationYear = publicationYear;
    }

    public String getName(){
        return title;
    }

    @Override
    public String toString() {
        return title + ", " + pages + " pages, " + publicationYear;
    }
}
