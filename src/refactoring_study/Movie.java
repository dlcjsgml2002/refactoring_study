package refactoring_study;

import refactoring_study.price.ChildrenPrice;
import refactoring_study.price.NewReleasePrice;
import refactoring_study.price.Price;
import refactoring_study.price.RegularPrice;

public class Movie {
	public static final int REGULAR = 0;
	public static final int NEW_RELEASE = 1;
	public static final int CHILDRENS = 2;

	private String title;
	private Price price;

	public Movie(String title, int priceCode) {
		this.title = title;
		setPriceCode(priceCode);
	}

	public int getPriceCode() {
		return price.getPriceCode();
	}

	public void setPriceCode(int aPriceCode) {
		switch (aPriceCode) {
		case REGULAR:
			price = new RegularPrice();
			break;
		case NEW_RELEASE:
			price = new NewReleasePrice();
			break;
		case CHILDRENS:
			price = new ChildrenPrice();
			break;
		default:
			throw new IllegalArgumentException("가격 코드가 잘못 되었습니다.");
		}
	}

	public String getTitle() {
		return title;
	}

	public double getCharge(int aDaysRented) {
		return price.getCharge(aDaysRented);
	}

	public int getFrequentRentalPoints(int aDaysRented) {
		return price.getFrequentRentalPoints(aDaysRented);
	}
}
