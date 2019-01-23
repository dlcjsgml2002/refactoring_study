package refactoring_study.price;

public abstract class Price {
	public abstract int getPriceCode();

	public abstract double getCharge(int aDaysRented);

	public int getFrequentRentalPoints(int aDaysRented) {
		return 1;
	}

}
