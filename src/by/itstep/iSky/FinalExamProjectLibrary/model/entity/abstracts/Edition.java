package by.itstep.iSky.FinalExamProjectLibrary.model.entity.abstracts;

public class Edition {
    private String tittle;
    private int countOfPage;
    private String genre;
    private double cost;
    private long numberOfEdition;


    public Edition() {
    }

    public Edition(String tittle, String genre, int countOfPage, double cost
            , long numberOfEdition) {
        this.tittle = tittle;
        setCountOfPage(countOfPage);
        this.genre = genre;
        setCost(cost);
        setNumberOfEdition(numberOfEdition);
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }


    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getCountOfPage() {
        return countOfPage;
    }

    public void setCountOfPage(int countOfPage) {
        if (countOfPage > 0) {
            this.countOfPage = countOfPage;
        }
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        if (cost > 0) {
            this.cost = cost;
        }
    }

    public long getNumberOfEdition() {
        return numberOfEdition;
    }

    public void setNumberOfEdition(long numberOfEdition) {
        if (numberOfEdition > 0) {
            this.numberOfEdition = numberOfEdition;
        }
    }

    @Override
    public String toString() {
        return " tittle = " + tittle +
                ", genre = " + genre +
                ", countOfPage = " + countOfPage +
                ", cost = " + cost +
                ", numberOfEdition = " + numberOfEdition;
    }
}
