package advancedJava.bookShop;

import java.util.ArrayList;

public class Book {
    private static final String INVALID_AUTHOR="Author not valid!";
    private static final String INVALID_TITLE="Title not valid!";
    private static final String INVALID_PRICE="Price not valid!";

    private String author;
    private String title;
    private double price;

    public Book(String author, String title, double price) {
        this.setAuthor(author);
        this.setTitle(title);
        this.setPrice(price);
    }

    public String getAuthor() {
        return author;
    }

    private void setAuthor(String author) throws IllegalArgumentException{

        String[] authorName=author.split("\\s+");

        if(authorName.length==2&&Character.isDigit(authorName[1].charAt(0)))
        {
          throw new IllegalArgumentException(INVALID_AUTHOR);
        }
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    private void setTitle(String title) throws IllegalArgumentException{
        if(title.length()<3)
        {
            throw new IllegalArgumentException(INVALID_TITLE);
        }
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    protected void setPrice(double price) throws IllegalArgumentException {
        if(price<=0)
        {
            throw new IllegalArgumentException(INVALID_PRICE);
        }
        this.price = price;
    }

    @Override
    public String toString() {
        final StringBuilder sb=new StringBuilder();
        sb.append("Type: ").append(this.getClass().getSimpleName())
                .append(System.lineSeparator())
                .append("Title: ").append(this.getTitle())
                .append(System.lineSeparator())
                .append("Author: ").append(this.getAuthor())
                .append(System.lineSeparator())
                .append("Price: ").append(this.getPrice())
                .append(System.lineSeparator());
        return sb.toString();
    }
}
