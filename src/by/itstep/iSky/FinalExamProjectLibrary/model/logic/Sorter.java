package by.itstep.iSky.FinalExamProjectLibrary.model.logic;

import by.itstep.iSky.FinalExamProjectLibrary.model.entity.Library;
import by.itstep.iSky.FinalExamProjectLibrary.model.entity.abstracts.Edition;
import by.itstep.iSky.FinalExamProjectLibrary.model.exception.EditionIndexOutOfBoundException;

public class Sorter {
    public static void sortByCostAsc(Library library) {
        try {
            for (int i = 0; i < library.getSize() - 1; i++) {
                for (int j = 0; j < library.getSize() - 1 - i; j++) {
                    if (library.get(j).getCost() > library.get(j + 1).getCost()) {
                        Edition temp = library.get(j);
                        library.set(j, library.get(j + 1));
                        library.set(j + 1, temp);
                    }
                }
            }
        } catch (EditionIndexOutOfBoundException exception) {
            //....
        }
    }

    public static void sortByNameAsc(Library library) {
        String s;
        try {
            for (int i = 0; i < library.getSize() - 1; i++) {
                for (int j = 0; j < library.getSize() - 1 - i; j++) {
                    if (library.get(j).toString().compareTo(library.get(j + 1)
                            .toString()) > 0) {
                        Edition temp = library.get(j);
                        library.set(j, library.get(j + 1));
                        library.set(j + 1, temp);
                    }
                }
            }
        } catch (EditionIndexOutOfBoundException exception) {
            //...
        }
    }

    public static void sortByNameDesc(Library library) {
        String s;
        try {
            for (int i = 0; i < library.getSize() - 1; i++) {
                for (int j = 0; j < library.getSize() - 1 - i; j++) {
                    if (library.get(j).toString().compareTo(library.get(j + 1)
                            .toString()) < 0) {
                        Edition temp = library.get(j);
                        library.set(j, library.get(j + 1));
                        library.set(j + 1, temp);
                    }
                }
            }
        } catch (EditionIndexOutOfBoundException exception) {
            //...
        }
    }
}