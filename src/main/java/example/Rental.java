package example;

public class Rental {
    private final Movie movie;
    private final int daysRented;

    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    public int getDaysRented() {
        return daysRented;
    }

    public Movie getMovie() {
        return movie;
    }

    public double getCharge() {
        return getMovie().getPrice().getCharge(getDaysRented());
    }

    public int getFrequentRenterPointsIncrement() {
        return getMovie().getPrice().getFrequentRenterPointsIncrement(getDaysRented());
    }

}
