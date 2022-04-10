package by.itstep.iSky.FinalExamProjectLibrary.model.entity;

import by.itstep.iSky.FinalExamProjectLibrary.model.entity.abstracts.Edition;

public class Magazine extends Edition {
    private String countryPublishingHouse;

    public Magazine() {
    }

    public Magazine(String tittle, int countOfPage, String genre
            , String countryPublishingHouse, double cost
            , long numberOfEdition) {
        super(tittle, genre, countOfPage, cost, numberOfEdition);
        this.countryPublishingHouse = countryPublishingHouse;
    }

    public String getCountryPublishingHouse() {
        return countryPublishingHouse;
    }

    public void setCountryPublishingHouse(String countryPublishingHouse) {
        this.countryPublishingHouse = countryPublishingHouse;
    }

    @Override
    public String toString() {
        return "Magazine{" + super.toString() +
                ", countryPublishingHouse = '" + countryPublishingHouse + '\'' +
                '}';
    }
}
