package by.itstep.iSky.FinalExamProjectLibrary.controller;

import by.itstep.iSky.FinalExamProjectLibrary.model.entity.Library;
//import by.itstep.iSky.FinalExamProjectLibrary.model.entity.abstracts.Edition;    //for commented objects below
//import by.itstep.iSky.FinalExamProjectLibrary.model.logic.LibraryAssistance;     //for commented objects below
import by.itstep.iSky.FinalExamProjectLibrary.model.logic.Sorter;
import by.itstep.iSky.FinalExamProjectLibrary.util.LibraryCreator;
import by.itstep.iSky.FinalExamProjectLibrary.view.Printer;

public class Main {
    public static void main(String[] args) {
        Library library = LibraryCreator.create();

        Printer.print("Editions without sorter: ");
        Printer.print(library);

        Printer.print("\nEditions with sorter by Cost ASC: ");
        Sorter.sortByCostAsc(library);
        Printer.print(library);

        Printer.print("\nEditions with sorter by Name ASC: ");
        Sorter.sortByNameAsc(library);
        Printer.print(library);

        Printer.print("\nEditions with sorter by Name DESC: ");
        Sorter.sortByNameDesc(library);
        Printer.print(library);

////       I leave a useful list for check below))))))

//        double total = LibraryAssistance.calcTotalPrice(LibraryCreator.create());
//        long totalCountOfPage = LibraryAssistance.calcTotalCountPage(LibraryCreator.create());
//        long countOfEdition = LibraryAssistance.calcNumberOfEdition(LibraryCreator.create());
//        double totalCostBookByGenre = LibraryAssistance.calcTotalPriceBooksByGenre(LibraryCreator.create());
//        long totalCountOfPageByGenre = LibraryAssistance.calcTotalCountPageByGenre(LibraryCreator.create());
//        double minCostOfEdition = LibraryAssistance.getMinCostOfEdition(LibraryCreator.create());
//        double maxCostOfEdition = LibraryAssistance.getMaxCostOfEdition(LibraryCreator.create());
//        long minCountOfPageEdition = LibraryAssistance.getMinCountOfPageEdition(LibraryCreator.create());
//        long maxCountOfPageEdition = LibraryAssistance.getMaxCountOfPageEdition(LibraryCreator.create());
//        long minCountOfEdition = LibraryAssistance.getMinCountOfEdition(LibraryCreator.create());
//        long maxCountOfEdition = LibraryAssistance.getMaxCountOfEdition(LibraryCreator.create());
//
//        Edition edition1 = LibraryAssistance.getMaxCostEdition(LibraryCreator.create());
//        Edition edition2 = LibraryAssistance.getMinCostEdition(LibraryCreator.create());
//        Edition edition3 = LibraryAssistance.getMaxCostBook(LibraryCreator.create());
//        Edition edition4 = LibraryAssistance.getMaxCountOfPageBook(LibraryCreator.create());
//        Edition edition5 = LibraryAssistance.getMaxNumberOfEdition(LibraryCreator.create());
//        Edition edition6 = LibraryAssistance.getMinNumberOfEdition(LibraryCreator.create());

//        Printer.print("\n Total price = " + total);
//        Printer.print("\n Total count of pages = " + totalCountOfPage);
//        Printer.print("\n Total count of edition = " + countOfEdition);
//        Printer.print("\n Sum cost of fantastic books = " + totalCostBookByGenre);
//        Printer.print("\n Sum count of page editions by genre Business = " + totalCountOfPageByGenre);
//        Printer.print("\n MAX cost of edition = " + maxCostOfEdition);
//        Printer.print("\n MIN cost of edition = " + minCostOfEdition);
//        Printer.print("\n MIN count of page = " + minCountOfPageEdition);
//        Printer.print("\n MAX count of page = " + maxCountOfPageEdition);
//        Printer.print("\n MIN count of edition = " + minCountOfEdition);
//        Printer.print("\n MAX count of edition = " + maxCountOfEdition);
//
//        Printer.print("\n MAX cost of edition = " + edition1);
//        Printer.print("\n MIN cost of edition = " + edition2);
//        Printer.print("\n MAX cost of books = " + edition3);
//        Printer.print("\n MAX count of page by book = " + edition4);
//        Printer.print("\n MAX count of edition = " + edition5);
//        Printer.print("\n MIN count of edition = " + edition6);
    }
}
