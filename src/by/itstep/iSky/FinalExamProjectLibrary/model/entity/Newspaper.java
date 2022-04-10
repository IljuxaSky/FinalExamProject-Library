package by.itstep.iSky.FinalExamProjectLibrary.model.entity;

import by.itstep.iSky.FinalExamProjectLibrary.model.entity.abstracts.Edition;

public class Newspaper extends Edition {
    private String exitPeriod;

    public Newspaper() {
    }

    public Newspaper(String tittle, int countOfPage, String genre, String exitPeriod
            , double cost, long numberOfEdition) {
        super(tittle, genre, countOfPage, cost, numberOfEdition);
        this.exitPeriod = exitPeriod;
    }

    public String getExitPeriod() {
        return exitPeriod;
    }

    public void setExitPeriod(String exitPeriod) {
        this.exitPeriod = exitPeriod;
    }

    @Override
    public String toString() {
        return "Newspaper {" + super.toString() +
                ", exitPeriod = '" + exitPeriod + "'" +
                '}';
    }
}
