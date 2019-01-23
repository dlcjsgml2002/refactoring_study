package refactoring_study.statement;

import refactoring_study.Customer;
import refactoring_study.Rental;

public class HtmlStatement extends Statement {
	@Override
	protected String eachRentalString(Rental each) {
		return String.format("%s : %s<br>%n", each.getMovie().getTitle(), each.getCharge());
	}

	@Override
	protected String footerString(Customer aCustomer) {
		return String.format("<p>누적 대여료 : <EM>%s</Em>%n<p>적립포인트 : <EM>%s</Em><p>", aCustomer.getTotalCharge(),
				aCustomer.getTotalFrequentRenterPoints());
	}

	@Override
	protected String headerString(String customerName) {
		return String.format("<H1><EM>%s , 고객님의 대여 기록</EM></H1><P>%n", customerName);
	}
}
