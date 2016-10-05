package ref;

import java.util.Enumeration;

public class ExtractMethod {

	/*START
	void printOwing() {
       Enumeration e = _orders.elements();
       double outstanding = 0.0;
       printBanner();
       // calculate outstanding
       while (e.hasMoreElements()) {
        Order each = (Order) e.nextElement();
           outstanding += each.getAmount();
       }
       //print details
       System.out.println ("name:" + _name);
       System.out.println ("amount" + outstanding);
   	}
	**/
	
	class Order {
		public double getAmount() {
			return 0;
		}
	}
	
	 class Orders {
		public Enumeration elements() {
			return null;
		}
	}
	
	private Orders _orders;
	private String _name;

	void printOwing() {
		printBanner();

		double outstanding = getOutstanding();
		printDetails(outstanding);
	}
	
	void printOwing(double previousAmount) {
		printBanner();
		double outstanding = getOutstanding(previousAmount * 1.2);
        printDetails(outstanding);
    }

	private double getOutstanding(double initialValue) {
		
		double result = initialValue;
		Enumeration e = _orders.elements();
        while (e.hasMoreElements()) {
            Order each = (Order) e.nextElement();
            result += each.getAmount();
        }
		return result;
	}
	

	private double getOutstanding() {
		Enumeration e = _orders.elements();
		double result = 0.0;
		while (e.hasMoreElements()) {
			Order each = (Order) e.nextElement();
			result += each.getAmount();
		}
		return result;
	}

	private void printDetails(double outstanding) {
		System.out.println("name:" + _name);
		System.out.println("amount" + outstanding);
	}

	private void printBanner() {
	}
}
