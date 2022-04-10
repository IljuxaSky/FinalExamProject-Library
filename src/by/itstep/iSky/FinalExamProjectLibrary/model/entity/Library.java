package by.itstep.iSky.FinalExamProjectLibrary.model.entity;

import by.itstep.iSky.FinalExamProjectLibrary.model.entity.abstracts.Edition;
import by.itstep.iSky.FinalExamProjectLibrary.model.exception.EditionIndexOutOfBoundException;

public class Library {
    private Edition[] editions;

    public Library() {
        editions = new Edition[0];
    }

    public Library(Edition[] editions) {
        this.editions = editions;
    }

    public Edition get(int index) throws EditionIndexOutOfBoundException {
        if (index >= 0 && index < editions.length) {
            return editions[index];
        } else {
            throw new EditionIndexOutOfBoundException();
        }
    }

    public void set(int index, Edition edition) throws EditionIndexOutOfBoundException {
        if (index >= 0 && index < editions.length && edition != null) {
            editions[index] = edition;
        } else {
            throw new EditionIndexOutOfBoundException();
        }
    }

    public int getSize() {
        return editions.length;
    }

    public void add(Edition edition) {
        Edition[] temp = new Edition[editions.length + 1];
        int i = 0;
        for (; i < editions.length; i++) {
            temp[i] = editions[i];
        }
        temp[i] = edition;
        editions = temp;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("List of editions:\n");
        for (Edition edition : editions) {
            builder.append(edition).append("\n");
        }

        return builder.toString();
    }
}
