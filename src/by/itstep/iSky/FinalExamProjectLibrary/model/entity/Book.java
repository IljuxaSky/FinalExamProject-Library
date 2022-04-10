package by.itstep.iSky.FinalExamProjectLibrary.model.entity;

import by.itstep.iSky.FinalExamProjectLibrary.model.entity.abstracts.Edition;

public class Book extends Edition {
    private String author;

    public Book() {
    }

    public Book(String tittle, int countOfPage, String genre, String author
            , double cost, long numberOfEdition) {
        super(tittle, genre, countOfPage, cost, numberOfEdition);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


    @Override
    public String toString() {
        return "Book{" +
                super.toString() +
                ", author = '" + author + "'" + '}';

    }
}
