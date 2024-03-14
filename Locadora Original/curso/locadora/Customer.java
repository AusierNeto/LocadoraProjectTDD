package curso.locadora;

import java.util.Enumeration;
import java.util.Vector;

public class Customer {
	
	private String _name;
	private Vector<Rental> _rentals = new Vector<Rental>();
	private int frequentRenterPoints;
	private double totalAmount;
	

	public Customer(String name) {
		_name = name;
	};

	public void addRental(Rental rental) {
		_rentals.addElement(rental);
		frequentRenterPoints += rental.getFrequentRenterPoints();
		totalAmount += rental.getAmount();
	}

	public String getName() {
		return _name;
	}
	
	private double getTotalAmount() {
		return totalAmount;
	}
	
	private int getFrequentRenterPoints() {
		return frequentRenterPoints;
	}

	public String statement() {
		Enumeration<Rental> rentals = _rentals.elements();
		String result = "Rental Record for " + getName() + "\n";
		
		while (rentals.hasMoreElements()) {
			Rental each = (Rental) rentals.nextElement();
			
			//show figures for this rental
			result += "\t" + each.getMovie().getTitle() + "\t"
					+ String.valueOf(totalAmount) + "\n";
		}
		
		//add footer lines
		result += "Amount owed is " + String.valueOf(getTotalAmount()) + "\n";
		result += "You earned " + String.valueOf(getFrequentRenterPoints())
				+ " frequent renter points";
		return result;
	}
	
}