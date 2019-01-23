package refactoring_study.price;

import refactoring_study.Movie;

public class RegularPrice extends Price {

	@Override
	public int getPriceCode() {
		// TODO Auto-generated method stub
		return Movie.REGULAR;
	}

	@Override
	public double getCharge(int aDaysRented) {
		double result = 0;
		result += 2;
		if (aDaysRented > 2)
			result += (aDaysRented - 2) * 1.5;
		return result;
	}

}
