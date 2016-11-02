package ref;

import java.util.Collection;

public class RaplaceDataValuewithObject {

	/* START
	  class Order { 
	  	public Order(String customer) { 
	  		_customer = customer;
	  	}
	  
	  	public String getCustomer() { return _customer; }
	  
	  	public void setCustomer(String arg) { _customer = arg; }
	  
	  	private String _customer; 
	  }
	  
	  private static int numberOfOrdersFor(Collection orders, String customer) {
        int result = 0;
        Iterator iter = orders.iterator();
        while (iter.hasNext()) {
            Order each = (Order) iter.next();
     		if (each.getCustomerName().equals(customer)) 
     			result++;
        }
        return result;
    }
	 */

	class Order {
		public Order(Customer customer) {
			_customer = customer;
		}

		public Customer getCustomer() {
			return _customer;
		}

		public void setCustomer(Customer c) {
			_customer = c;
		}

		private Customer _customer;

		int numberOfOrdersFor(Collection<Order> orders, Customer customer) {
			int result = 0;
			for (Order order : orders) {
				if (order.getCustomer().equals(customer))
					result++;
			}
			
			return result;
		}
	}

	class Customer {
		private final String _name;

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + getOuterType().hashCode();
			result = prime * result + ((_name == null) ? 0 : _name.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Customer other = (Customer) obj;
			if (!getOuterType().equals(other.getOuterType()))
				return false;
			if (_name == null) {
				if (other._name != null)
					return false;
			} else if (!_name.equals(other._name))
				return false;
			return true;
		}

		public Customer(String name) {
			_name = name;
		}

		public String getName() {
			return _name;
		}

		private RaplaceDataValuewithObject getOuterType() {
			return RaplaceDataValuewithObject.this;
		}
	}
}
