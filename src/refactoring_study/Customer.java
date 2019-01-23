package refactoring_study;

import java.util.ArrayList;
import java.util.List;

import refactoring_study.statement.HtmlStatement;
import refactoring_study.statement.Statement;
import refactoring_study.statement.TextStatement;

public class Customer {
	private String name;
	private List<Rental> rentals = new ArrayList<>();

	public Customer(String aName) {
		this.name = aName;
	}

	public void addRental(Rental aRental) {
		this.rentals.add(aRental);
	}

	public List<Rental> getRentals() {
		return rentals;
	}

	public String getName() {
		return this.name;
	}

	public String statement() {
		Statement statement = new TextStatement();
		return statement.value(this);
	}

	public String htmlStatement() {
		Statement statement = new HtmlStatement();
		return statement.value(this);
	}

	public double getTotalFrequentRenterPoints() {
		double result = 0;
		for (Rental each : rentals) {
			result += each.getFrequentRentalPoints();
		}
		return result;
	}

	public double getTotalCharge() {
		double result = 0;
		for (Rental each : rentals) {
			result += each.getCharge();
		}
		return result;
	}

}
