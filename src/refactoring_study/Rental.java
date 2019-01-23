package refactoring_study;

public class Rental {
	private Movie movie;
	private int daysRented;

	public Rental(Movie aMovie, int aDaysRented) {
		this.movie = aMovie;
		this.daysRented = aDaysRented;
	}

	public Movie getMovie() {
		return this.movie;
	}

	public int getDaysRented() {
		return this.daysRented;
	}

	public double getCharge() {
		return movie.getCharge(daysRented);
	}

	public int getFrequentRentalPoints() {
		return movie.getFrequentRentalPoints(daysRented);
	}
}
