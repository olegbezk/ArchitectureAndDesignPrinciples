package com.udemy.training.solid;

public class Book implements BookHandler{

    private BookPersistence bookPersistence;

    private int numOfPages;

    private String authorName;

    public Book(final int numOfPages, final String authorName) {
        this.numOfPages = numOfPages;
        this.authorName = authorName;
        this.bookPersistence = new BookPersistence();
    }

    public int getNumOfPages() {
        return numOfPages;
    }

    public void setNumOfPages(final int numOfPages) {
        this.numOfPages = numOfPages;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(final String authorName) {
        this.authorName = authorName;
    }

    @Override
    public String toString() {
        return "Book{" +
                "numOfPages=" + numOfPages +
                ", authorName='" + authorName + '\'' +
                '}';
    }

    @Override
    public void save() {
        bookPersistence.save(this);
    }
}
