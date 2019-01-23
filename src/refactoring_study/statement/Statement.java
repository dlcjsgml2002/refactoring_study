package refactoring_study.statement;

import java.util.List;

import refactoring_study.Customer;
import refactoring_study.Rental;

public abstract class Statement {
	public String value(Customer aCustomer) {
		List<Rental> rentals = aCustomer.getRentals();
		StringBuilder result = new StringBuilder();
		result.append(headerString(aCustomer.getName()));

		for (Rental each : rentals) {
			result.append(eachRentalString(each));
		}

		result.append(footerString(aCustomer));

		return result.toString();
	}

	protected abstract String eachRentalString(Rental each);

	protected abstract String footerString(Customer aCustomer);

	protected abstract String headerString(String customerName);
}
