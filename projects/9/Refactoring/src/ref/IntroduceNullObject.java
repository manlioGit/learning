package ref;

public class IntroduceNullObject {

	/*START
	public class BillingPlan {
		public static BillingPlan basic() {
			return null;
		}

	}

	class Site {
		Customer getCustomer() {
			return _customer;
		}

		Customer _customer;
	}

	class Customer {
		public String getName() {
			return "xxx";
		}

		public BillingPlan getPlan() {
			return null;
		}

		public PaymentHistory getHistory() {
			return null;
		}
	}

	class PaymentHistory {
		int getWeeksDelinquentInLastYear() {
			return 0;
		}
	}

	class Exec {
		void doIt() {
			Customer customer = new Site().getCustomer();

			BillingPlan plan;
			if (customer == null) {
				plan = BillingPlan.basic();
			} else {
				plan = customer.getPlan();
			}
			String customerName;
			if (customer == null) {
				customerName = "occupant";
			} else {
				customerName = customer.getName();
			}
			int weeksDelinquent;
			if (customer == null) {
				weeksDelinquent = 0;
			} else {
				weeksDelinquent = customer.getHistory().getWeeksDelinquentInLastYear();
			}
		}
	}
	*/
	
	/*Alternative default instance
	  class Customer {
		
		private String _name;
		private BillingPlan _plan;
		
		Customer(){
			_name = "occupant";
			_plan = new BillingPlan();
		}
		
		public String getName() {
			return _name;
		}
		
		public void setName(String name) {
			_name = name;
		}

		public BillingPlan getPlan() {
			return _plan;
		}
		
		public void setPlan(BillingPlan plan) {
			_plan = plan;
		}

		...
	}
	  
	 */
	
	public class BillingPlan {
		public static BillingPlan basic() {
			return null;
		}

	}

	class Site {
		Customer getCustomer() {
			return _customer == null ? new NullCustomer() : _customer;
		}

		Customer _customer;
	}

	class NullCustomer extends Customer {
		
		@Override
		boolean isNull() {
			return true;
		}
		
		@Override
		public String getName() {
			return "occupant";
		}
		
		@Override
		public BillingPlan getPlan() {
			return BillingPlan.basic();
		}
		
		@Override
		int getWeeksDelinquentInLastYear() {
			return 0;
		}
	}
	
	class Customer {
		
		boolean isNull(){
			return false;
		}
		
		
		public String getName() {
			return "xxx";
		}

		public BillingPlan getPlan() {
			return null;
		}

		public PaymentHistory getHistory() {
			return null;
		}
		
		int getWeeksDelinquentInLastYear(){
			return getHistory().getWeeksDelinquentInLastYear();
		}
	}

	class PaymentHistory {
		int getWeeksDelinquentInLastYear() {
			return 0;
		}
	}

	class Exec {
		void doIt() {
			Customer customer = new Site().getCustomer();

			BillingPlan plan = customer.getPlan();
			String customerName = customer.getName();
			int weeksDelinquent = customer.getWeeksDelinquentInLastYear();
		}
	}
}
