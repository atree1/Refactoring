package store;

import java.util.Vector;

public class Customer {

	private String _name;
	private Vector _rentals = new Vector();

	public Customer(String _name) {

		this._name = _name;
	}

	public void addRental(Rental arg) {
		_rentals.addElement(arg);
		
	}

	public String get_name() {
		return _name;
	}
	
	public String statement() {
		return null;
	}
}
