package ref;

import java.util.HashSet;
import java.util.Set;

public class ChangeBidirectionalAssociationToUnidirectional {

	/*START
	class Order {
	    Customer getCustomer() {
	        return _customer;
	    }
	    void setCustomer (Customer arg) {
	        if (_customer != null) _customer.friendOrders().remove(this);
	        _customer = arg;
	        if (_customer != null) _customer.friendOrders().add(this);
	    }
	    
	    double getDiscountedPrice() {
	    	return 1 -_customer.getDiscount();
	    }
	    
	    private Customer _customer;
	  }
	  
	  class Customer{
	    private Set _orders = new HashSet();
	   
	    void addOrder(Order arg) {
	    	arg.setCustomer(this);
	    }
	    public int getDiscount() {
			return 0;
		}
		Set friendOrders() {
	        return _orders;
	    }
	  }
	*/
	
	  class Order {

	    double getDiscountedPrice(Customer c) {
	    	return 1 -c.getDiscount();
	    }
	  }
	  
	  class Customer{
	    private Set _orders = new HashSet();
	   
	    void addOrder(Order arg) {
	    	_orders.add(arg);
	    }
	    public int getDiscount() {
			return 0;
		}
		Set friendOrders() {
	        /** should only be used by Order */
	        return _orders;
	    }
	  }
}
