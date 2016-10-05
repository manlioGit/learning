package ref;

import java.util.Enumeration;
import java.util.Vector;

public class FormTemplateMethod {

	/*START
	class Customer {
		private Vector _rentals = new Vector();

		public String statement() {
			Enumeration rentals = _rentals.elements();
			String result = "Rental Record for " + getName() + "\n";
			while (rentals.hasMoreElements()) {
				Rental each = (Rental) rentals.nextElement();
				// show figures for this rental
				result += "\t" + each.getMovie().getTitle() + "\t"
						+ String.valueOf(each.getCharge()) + "\n";
			}
			// add footer lines
			result += "Amount owed is " + String.valueOf(getTotalCharge())
					+ "\n";
			result += "You earned "
					+ String.valueOf(getTotalFrequentRenterPoints())
					+ " frequent renter points";
			return result;
		}

		public String htmlStatement() {
			Enumeration rentals = _rentals.elements();
			String result = "<H1>Rentals for <EM>" + getName()
					+ "</EM></H1><P>\n";
			while (rentals.hasMoreElements()) {
				Rental each = (Rental) rentals.nextElement();
				// show figures for each rental
				result += each.getMovie().getTitle() + ": "
						+ String.valueOf(each.getCharge()) + "<BR>\n";
			}
			// add footer lines
			result += "<P>You owe <EM>" + String.valueOf(getTotalCharge())
					+ "</EM><P>\n";
			result += "On this rental you earned <EM>"
					+ String.valueOf(getTotalFrequentRenterPoints())
					+ "</EM> frequent renter points<P>";
			return result;
		}*/
	
	class Customer {
		private final Vector _rentals = new Vector();

		public Enumeration getRentals() {
			return _rentals.elements();
		}

		public String statement() {
			return new TextStatement().value(this);
		}

		public String htmlStatement() {
			return new HtmlStatement().value(this);
		}

		private int getTotalFrequentRenterPoints() {
			return 0;
		}

		private double getTotalCharge() {
			return 0;
		}

		private String getName() {
			return null;
		}
	}
	
	abstract class Statement {
		
		public String value(Customer customer) {
			String result = header(customer);
			Enumeration rentals = customer.getRentals();
			while (rentals.hasMoreElements()) {
				result += line((Rental) rentals.nextElement());
			}
			result += footer(customer);
			
			return result;
		}
		
		abstract String header(Customer c);
		abstract String line(Rental r);
		abstract String footer(Customer c);
	}
	
	class TextStatement extends Statement {
		
		@Override	
		String header(Customer customer) {
			return "Rental Record for " + customer.getName() + "\n";
		}

		@Override
		String line(Rental r){
			return "\t" + r.getMovie().getTitle() + "\t" + String.valueOf(r.getCharge()) + "\n";
		}
		
		@Override
		String footer(Customer c){
			return "Amount owed is " + String.valueOf(c.getTotalCharge()) + "\n" +
					"You earned " + String.valueOf(c.getTotalFrequentRenterPoints()) + 
					" frequent renter points";
		}
		
	}
	
	class HtmlStatement extends Statement {

		@Override
		String header(Customer customer) {
			return "<H1>Rentals for <EM>" + customer.getName() + "</EM></H1><P>\n";
		}

		@Override
		String line(Rental r){
			return r.getMovie().getTitle() + ": " + String.valueOf(r.getCharge()) + "<BR>\n";
		}
		
		@Override
		String footer(Customer c){
			return "<P>You owe <EM>" + String.valueOf(c.getTotalCharge()) + "</EM><P>\n" +
				   "On this rental you earned <EM>" + String.valueOf(c.getTotalFrequentRenterPoints()) + 
				   "</EM> frequent renter points<P>";
		}
	}

	public class Movie {

		public String getTitle() {
			return null;
		}
	}

	public class Rental {
		public Movie getMovie() {
			return null;
		}

		public double getCharge() {
			return 0;
		}
	}
}
