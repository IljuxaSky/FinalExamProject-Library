package by.itstep.iSky.FinalExamProjectLibrary.model.logic;

import by.itstep.iSky.FinalExamProjectLibrary.model.entity.Library;
import by.itstep.iSky.FinalExamProjectLibrary.model.entity.Book;
import by.itstep.iSky.FinalExamProjectLibrary.model.entity.Magazine;
import by.itstep.iSky.FinalExamProjectLibrary.model.entity.Newspaper;

import static org.junit.Assert.*;

import org.junit.Test;

public class LibraryAssistanceTest {
    private Library library;

    public LibraryAssistanceTest() {
        library = new Library();

        library.add(new Book("The Lord of the Rings", 862
                , "Fantastic", "John Tolkien", 92, 300000));
        library.add(new Book("Dune", 1234
                , "Fantastic", "Frank Herbert", 34, 425000));
        library.add(new Book("Mr. Mercedes", 923
                , "Detective ", "Stephen King", 48, 380000));
        library.add(new Book("The Seven Habits of Highly Effective People", 652
                , "Business", "Stephen Covey", 112, 600));
        library.add(new Book("Children of Captain Grant", 1114,
                "Adventures", "Jules Verne", 49, 556000));
        library.add(new Newspaper("EXPERT ONLINE", 8
                , "Business", "every week", 7.9, 158000));
        library.add(new Newspaper("THE DAILY TELEGRAPH", 8
                , "Mixed", "every day", 3, 850000));
        library.add(new Magazine("VOGUE", 87,
                "Fashion", "USA", 29, 96000));
        library.add(new Magazine("NEW YORK TIMES", 64,
                "Business", "USA", 38, 17000));
        library.add(new Magazine("MERCHANT", 114,
                "Business", "Russia", 39, 19500));

    }

    @Test
    public void testCalcTotalPricePozitive() {


        double expectedTotalPrice = 451.9;
        double actualTotalPrice = LibraryAssistance.calcTotalPrice(library);
        assertEquals(expectedTotalPrice, actualTotalPrice, 0);
    }

    @Test
    public void testCalcTotalCountOfPagePozitive() {

        double expectedTotalCountOfPage = 5066;
        double actualTotalCountOfPage = LibraryAssistance.calcTotalCountPage(library);
        assertEquals(expectedTotalCountOfPage, actualTotalCountOfPage, 0);
    }

    @Test
    public void testCalcTotalCountOfEdition() {

        double expectedCountOfEdition = 2802100;
        double actualCountOfEdition = LibraryAssistance.calcNumberOfEdition(library);
        assertEquals(expectedCountOfEdition, actualCountOfEdition, 0);
    }

    @Test
    public void testCalcCostBookByGenre() {

        double expectedTotalCostBookByGenre = 126;
        double actualTotalCostBookByGenre = LibraryAssistance
                .calcTotalPriceBooksByGenre(library);
        assertEquals(expectedTotalCostBookByGenre, actualTotalCostBookByGenre, 0);
    }

    @Test
    public void testCalcMinCostOfEdition() {

        double expectedMinCostOfEdition = 3;
        double actualMinCostOfEdition = LibraryAssistance.getMinCostOfEdition(library);
        assertEquals(expectedMinCostOfEdition, actualMinCostOfEdition, 0);
    }

    @Test
    public void testCalcMaxCostOfEdition() {

        double expectedMaxCostOfEdition = 112;
        double actualMaxCostOfEdition = LibraryAssistance.getMaxCostOfEdition(library);
        assertEquals(expectedMaxCostOfEdition, actualMaxCostOfEdition, 0);
    }

    @Test
    public void testCalcMinCountOfPageByEdition() {

        long expectedMinCountOfPageByEdition = 8;
        long actualMinCountOfPageByEdition = LibraryAssistance
                .getMinCountOfPageEdition(library);
        assertEquals(expectedMinCountOfPageByEdition, actualMinCountOfPageByEdition);
    }

    @Test
    public void testCalcMaxCountOfPageByEdition() {

        long expectedMaxCountOfPageByEdition = 1234;
        long actualMaxCountOfPageByEdition = LibraryAssistance
                .getMaxCountOfPageEdition(library);
        assertEquals(expectedMaxCountOfPageByEdition, actualMaxCountOfPageByEdition);
    }

    @Test
    public void testCalcMinCountEdition() {

        long expectedMinCountEdition = 600;
        long actualMinCountEdition = LibraryAssistance.getMinCountOfEdition(library);
        assertEquals(expectedMinCountEdition, actualMinCountEdition);
    }

    @Test
    public void testCalcMaxCountEdition() {

        long expectedMaxCountEdition = 850000;
        long actualMaxCountEdition = LibraryAssistance.getMaxCountOfEdition(library);
        assertEquals(expectedMaxCountEdition, actualMaxCountEdition);
    }
}
