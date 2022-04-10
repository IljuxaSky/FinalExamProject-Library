package by.itstep.iSky.FinalExamProjectLibrary.util;

import by.itstep.iSky.FinalExamProjectLibrary.model.entity.Book;
import by.itstep.iSky.FinalExamProjectLibrary.model.entity.Library;
import by.itstep.iSky.FinalExamProjectLibrary.model.entity.Magazine;
import by.itstep.iSky.FinalExamProjectLibrary.model.entity.Newspaper;

public class LibraryCreator {
    public static Library create() {
        Library library = new Library();

        library.add(new Book("The Lord of the Rings", 862
                , "Fantastic", "John Tolkien", 92, 300000));
        library.add(new Book("Dune", 1234
                , "Fantastic", "Frank Herbert", 34, 425000));
        library.add(new Book("Mr. Mercedes", 923
                , "Detective ", "Stephen King", 48, 380000));
        library.add(new Book("Disappeared", 647
                , "Detective ", "Gillian Flynn", 57, 400000));
        library.add(new Book("Emotional Intelligence", 872
                , "Psychology", "Daniel Goleman", 72, 570000));
        library.add(new Book("The Psychology of Influence", 924
                , "Psychology", "Robert Cialdini", 77, 280000));
        library.add(new Book("The Seven Habits of Highly Effective People", 652
                , "Business", "Stephen Covey", 112, 600));
        library.add(new Book("Zero to One", 724
                , "Business", "Peter Thiel", 254, 200));
        library.add(new Book("Robinson Crusoe", 1254
                , "Adventures", "Daniel Defoe", 57, 650000));
        library.add(new Book("Children of Captain Grant", 1114,
                "Adventures", "Jules Verne", 49, 556000));
        library.add(new Newspaper("THE DAILY TELEGRAPH", 8
                , "Mixed", "every day", 3, 850000));
        library.add(new Newspaper("LOS ANGELES TIMES", 12
                , "Mixed", "every day", 5, 200000));
        library.add(new Newspaper("USA TODAY", 18
                , "Mixed", "every day", 4.2, 100000));
        library.add(new Newspaper("THE NEW YORK TIMES", 16
                , "political", "every day", 7.4, 300000));
        library.add(new Newspaper("THE WASHINGTON POST", 8
                , "political", "every day", 3.8, 800000));
        library.add(new Newspaper("THE TIMES", 10
                , "political", "every week", 6.3, 235000));
        library.add(new Newspaper("CHILDREN'S ENTERTAINMENT", 6
                , "children's ", "every week", 5.2, 440000));
        library.add(new Newspaper("CHILDREN'S KITCHEN", 4
                , "children's ", "every week", 3.3, 870000));
        library.add(new Newspaper("FINANCIAL TIMES", 12,
                "Business", "every week", 5.1, 425000));
        library.add(new Newspaper("EXPERT ONLINE", 8
                , "Business", "every week", 7.9, 158000));
        library.add(new Magazine("VOGUE", 87,
                "Fashion", "USA", 29, 96000));
        library.add(new Magazine("COSMOPOLITAN", 96,
                "Fashion", "Russia", 31.2, 73000));
        library.add(new Magazine("FASHION COLLECTION", 124,
                "Fashion", "Belarus", 43.4, 58000));
        library.add(new Magazine("PUCK", 54,
                "Humor", "USA", 15, 85000));
        library.add(new Magazine("THE ECHO", 68,
                "Humor", "USA", 16.4, 73000));
        library.add(new Magazine("THE ECONOMIST", 48,
                "finance", "USA", 27, 32000));
        library.add(new Magazine("FINANCIAL TIMES", 82,
                "finance", "United of Kingdom", 28.3, 35000));
        library.add(new Magazine("NEW YORK TIMES", 64,
                "Business", "USA", 38, 17000));
        library.add(new Magazine("FORBES", 56,
                "finance", "USA", 34.2, 12000));
        library.add(new Magazine("MERCHANT", 114,
                "Business", "Russia", 39, 19500));

        return library;
    }
}
