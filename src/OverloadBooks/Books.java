package OverloadBooks;

public class Books {
    private String title;
    private int pages;
    private int publicationYear;
    private String author;
    private String publisher;
    private double price;


    public Books(String title, int pages, int publicationYear) {
        this.title = title;
        this.pages = pages;
        this.publicationYear = publicationYear;
            }

    public Books(String title, int pages, int publicationYear, String author, String publisher, double price) {
        this.title = title;
        this.pages = pages;
        this.publicationYear = publicationYear;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
    }
    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public double getPrice() {
        return price;
    }

    public String getTitle() {
        return title;
    }

    public int getPages() {
        return pages;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public String toString() {
        return title + "'s author is: " + author + ", the publisher is " + publisher + ", the number of pages is " + pages + "\n"
                + "published in: " + publicationYear + ". The price is: $" + price;
    }
}
