package store;

import java.util.Enumeration;
import java.util.Vector;

public class Customer {

	private String name;
	private Vector rentals = new Vector();

	public Customer(String name) {

		this.name = name;
	}

	public void addRental(Rental arg) {
		rentals.addElement(arg);

	}

	public String getName() {
		return name;
	}
	public String statement() {
		Enumeration rentals = this.rentals.elements();

		String result = getName() + "대여기록 \n";
		while (rentals.hasMoreElements()) {

			Rental each = (Rental) rentals.nextElement();

			result += "\t" + each.getMovie().getTitle() + "\t" + String.valueOf(each.getCharge()) + "\n";

		}
		result += "누적 대여료: " + String.valueOf(getTotalCharge()) + "\n";
		result += "적립 포인트: " + String.valueOf(getTotalFrequentRenterPoints()) + "\n";

		return result;
	}
	public String htmlStatement() {
		Enumeration rentals = this.rentals.elements();

		String result ="<H1>"+ getName() + "대여기록  </H1>\n";
		while (rentals.hasMoreElements()) {

			Rental each = (Rental) rentals.nextElement();

			result += "\t" + each.getMovie().getTitle() + "\t" + String.valueOf(each.getCharge()) + "\n";

		}
		result += "누적 대여료: " + String.valueOf(getTotalCharge()) + "\n";
		result += "적립 포인트: " + String.valueOf(getTotalFrequentRenterPoints()) + "\n";

		return result;
	}

	private double getTotalCharge() {
		double result = 0;
		Enumeration rentals = this.rentals.elements();
		while (rentals.hasMoreElements()) {

			Rental each = (Rental) rentals.nextElement();
			result += each.getCharge();
		}
		return result;
	}

	private int getTotalFrequentRenterPoints() {
		int result = 0;
		Enumeration rentals = this.rentals.elements();

		while (rentals.hasMoreElements()) {

			Rental each = (Rental) rentals.nextElement();
			result += each.getFrequentRenterPoints();
		}

		return result;
	}
}
