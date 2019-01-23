package refactoring_study.price;

import refactoring_study.Movie;

public class NewReleasePrice extends Price {

	@Override
	public int getPriceCode() {
		// TODO Auto-generated method stub
		return Movie.NEW_RELEASE;
	}

	@Override
	public double getCharge(int aDaysRented) {
		double result = 0;
		result += aDaysRented * 3;
		return result;
	}

	@Override
	public int getFrequentRentalPoints(int aDaysRented) {
		return aDaysRented > 1 ? 2 : 1;
	}

}
