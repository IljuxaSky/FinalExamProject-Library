package by.itstep.iSky.FinalExamProjectLibrary.model.logic;

import by.itstep.iSky.FinalExamProjectLibrary.model.entity.Book;
import by.itstep.iSky.FinalExamProjectLibrary.model.entity.Library;
import by.itstep.iSky.FinalExamProjectLibrary.model.entity.abstracts.Edition;
import by.itstep.iSky.FinalExamProjectLibrary.model.exception.EditionIndexOutOfBoundException;

public class LibraryAssistance {
    public static double calcTotalPrice(Library library) {
        double total = 0;

        try {
            for (int i = 0; i < library.getSize(); i++) {
                Edition edition = library.get(i);
                total += edition.getCost();
            }

        } catch (EditionIndexOutOfBoundException exc) {
            System.err.print(exc);
        }

        return total;
    }

    public static long calcTotalCountPage(Library library) {
        long totalCountOfPage = 0;

        try {
            for (int i = 0; i < library.getSize(); i++) {
                Edition edition = library.get(i);
                totalCountOfPage += edition.getCountOfPage();
            }

        } catch (EditionIndexOutOfBoundException exc) {
            System.err.print(exc);
        }


        return totalCountOfPage;
    }

    public static long calcNumberOfEdition(Library library) {
        long countOfEdition = 0;

        try {
            for (int i = 0; i < library.getSize(); i++) {
                Edition edition = library.get(i);
                countOfEdition += edition.getNumberOfEdition();
            }

        } catch (EditionIndexOutOfBoundException exc) {
            System.err.print(exc);
        }

        return countOfEdition;
    }

    public static Edition getMaxCostEdition(Library library) {
        Edition edition = null;
        int index = 0;

        try {
            for (int i = 0; i < library.getSize(); i++) {
                if (library.get(index).getCost() < library.get(i).getCost()) {
                    index = i;
                }
            }
            edition = library.get(index);
        } catch (EditionIndexOutOfBoundException exc) {
            System.err.print(exc);
        }

        return edition;
    }

    public static Edition getMinCostEdition(Library library) {
        Edition edition = null;
        int index = 0;

        try {
            for (int i = 0; i < library.getSize(); i++) {
                if (library.get(index).getCost() > library.get(i).getCost()) {
                    index = i;
                }
            }
            edition = library.get(index);
        } catch (EditionIndexOutOfBoundException exc) {
            System.err.print(exc);
        }

        return edition;
    }

    public static Book getMaxCostBook(Library library) {
        int index = -1;
        double maxCost = Double.MIN_VALUE;
        Book book = null;

        try {

            for (int i = 0; i < library.getSize(); i++) {
                Edition edition = library.get(i);
                if (edition instanceof Book) {
                    if (library.get(i).getCost() > maxCost) {
                        maxCost = library.get(i).getCost();
                        index = i;
                    }
                }
            }
            if (index != -1) {
                book = (Book) library.get(index);
            }
        } catch (EditionIndexOutOfBoundException exc) {
            System.err.print(exc);
        }

        return book;
    }

    public static Book getMaxCountOfPageBook(Library library) {
        int index = -1;
        double maxCountOfPage = Double.MIN_VALUE;
        Book book = null;

        try {

            for (int i = 0; i < library.getSize(); i++) {
                Edition edition = library.get(i);
                if (edition instanceof Book) {
                    Book temp = (Book) edition;
                    if (temp.getCountOfPage() > maxCountOfPage) {
                        maxCountOfPage = temp.getCountOfPage();
                        index = i;
                    }
                }
            }
            if (index != -1) {
                book = (Book) library.get(index);
            }
        } catch (EditionIndexOutOfBoundException exc) {
            System.err.print(exc);
        }

        return book;
    }

    public static double calcTotalPriceBooksByGenre(Library library) {
        int index = -1;
        double totalCostBook = 0;
        Book book = null;

        try {

            for (int i = 0; i < library.getSize(); i++) {
                Edition edition = library.get(i);
                if (edition instanceof Book) {
                    Book temp = (Book) edition;
                    if (temp.getGenre().equals("Fantastic")) {
                        totalCostBook += library.get(i).getCost();
                        index = i;
                    }
                }
            }
            if (index != -1) {
                book = (Book) library.get(index);
            }

        } catch (EditionIndexOutOfBoundException exc) {
            System.err.print(exc);
        }

        return totalCostBook;
    }

    public static long calcTotalCountPageByGenre(Library library) {
        long totalCountOfPageByGenre = 0;

        try {
            for (int i = 0; i < library.getSize(); i++) {
                Edition edition = library.get(i);
                if (edition.getGenre().equals("Business")) {
                    totalCountOfPageByGenre += edition.getCountOfPage();
                }
            }

        } catch (EditionIndexOutOfBoundException exc) {
            System.err.print(exc);
        }


        return totalCountOfPageByGenre;
    }

    public static Edition getMaxNumberOfEdition(Library library) {
        Edition edition = null;
        int index = 0;

        try {
            for (int i = 0; i < library.getSize(); i++) {
                if (library.get(index).getNumberOfEdition() < library.get(i)
                        .getNumberOfEdition()) {
                    index = i;
                }
            }
            edition = library.get(index);
        } catch (EditionIndexOutOfBoundException exc) {
            System.err.print(exc);
        }

        return edition;
    }

    public static Edition getMinNumberOfEdition(Library library) {
        Edition edition = null;
        int index = 0;

        try {
            for (int i = 0; i < library.getSize(); i++) {
                if (library.get(index).getNumberOfEdition() > library.get(i)
                        .getNumberOfEdition()) {
                    index = i;
                }
            }
            edition = library.get(index);
        } catch (EditionIndexOutOfBoundException exc) {
            System.err.print(exc);
        }

        return edition;
    }

    public static double getMinCostOfEdition(Library library) {
        double minCostOfEdition = Double.MIN_VALUE;
        ;
        int index = 0;
        try {
            for (int i = 0; i < library.getSize(); i++) {
                if (library.get(index).getCost() > library.get(i).getCost()) {
                    Edition edition = library.get(i);
                    minCostOfEdition = edition.getCost();
                    index = i;
                }
            }
        } catch (EditionIndexOutOfBoundException exc) {
            System.err.print(exc);
        }

        return minCostOfEdition;
    }

    public static double getMaxCostOfEdition(Library library) {
        double maxCostOfEdition = 0;
        int index = 0;
        try {
            for (int i = 0; i < library.getSize(); i++) {
                if (library.get(index).getCost() < library.get(i).getCost()) {
                    Edition edition = library.get(i);
                    maxCostOfEdition = edition.getCost();
                    index = i;
                }
            }
        } catch (EditionIndexOutOfBoundException exc) {
            System.err.print(exc);
        }

        return maxCostOfEdition;
    }

    public static long getMinCountOfPageEdition(Library library) {
        long minCountOfPageEdition = 0;
        int index = 0;
        try {
            for (int i = 0; i < library.getSize(); i++) {
                if (library.get(index).getCountOfPage() > library.get(i).getCountOfPage()) {
                    Edition edition = library.get(i);
                    minCountOfPageEdition = edition.getCountOfPage();
                    index = i;
                }
            }
        } catch (EditionIndexOutOfBoundException exc) {
            System.err.print(exc);
        }

        return minCountOfPageEdition;
    }


    public static long getMaxCountOfPageEdition(Library library) {
        long maxCountOfPageEdition = 0;
        int index = 0;
        try {
            for (int i = 0; i < library.getSize(); i++) {
                if (library.get(index).getCountOfPage() < library.get(i).getCountOfPage()) {
                    Edition edition = library.get(i);
                    maxCountOfPageEdition = edition.getCountOfPage();
                    index = i;
                }
            }
        } catch (EditionIndexOutOfBoundException exc) {
            System.err.print(exc);
        }

        return maxCountOfPageEdition;
    }

    public static long getMinCountOfEdition(Library library) {
        long minCountOfEdition = 0;
        int index = 0;
        try {
            for (int i = 0; i < library.getSize(); i++) {
                if (library.get(index).getNumberOfEdition() > library.get(i).getNumberOfEdition()) {
                    Edition edition = library.get(i);
                    minCountOfEdition = edition.getNumberOfEdition();
                    index = i;
                }
            }
        } catch (EditionIndexOutOfBoundException exc) {
            System.err.print(exc);
        }

        return minCountOfEdition;
    }

    public static long getMaxCountOfEdition(Library library) {
        long maxCountOfEdition = 0;
        int index = 0;
        try {
            for (int i = 0; i < library.getSize(); i++) {
                if (library.get(index).getNumberOfEdition() < library.get(i).getNumberOfEdition()) {
                    Edition edition = library.get(i);
                    maxCountOfEdition = edition.getNumberOfEdition();
                    index = i;
                }
            }
        } catch (EditionIndexOutOfBoundException exc) {
            System.err.print(exc);
        }
        return maxCountOfEdition;
    }
}