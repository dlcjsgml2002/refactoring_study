package refactoring_study.statement;

import refactoring_study.Customer;
import refactoring_study.Rental;

public class TextStatement extends Statement {

	@Override
	protected String eachRentalString(Rental each) {
		return String.format("\t%s\t%s%n", each.getMovie().getTitle(), each.getCharge());
	}

	@Override
	protected String footerString(Customer aCustomer) {
		return String.format("\t누적 대여료 : %s%n적립포인트 : %s", aCustomer.getTotalCharge(),
				aCustomer.getTotalFrequentRenterPoints());
	}

	@Override
	protected String headerString(String customerName) {
		return String.format("%s , 고객님의 대여 기록%n", customerName);
	}
}
