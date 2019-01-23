package refactoring_study.price;

import refactoring_study.Movie;

public class ChildrenPrice extends Price {

	@Override
	public int getPriceCode() {
		// TODO Auto-generated method stub
		return Movie.CHILDRENS;
	}

	@Override
	public double getCharge(int aDaysRented) {
		double result = 0;
		result += 1.5;
		if (aDaysRented > 3)
			result += (aDaysRented - 3) * 1.5;
		return result;
	}

}
