package ref;

import java.util.Date;


public class PullUpMethod {

	/*START
	abstract class Customer {
		protected Date lastBillDate;

		public void addBill(Date date, double amount) {
		}
	}

	class RegularCustomer extends Customer {
		void createBill(Date date) {
			double chargeAmount = chargeFor(lastBillDate, date);
			addBill(date, chargeAmount);
		}

		private double chargeFor(Date lastBillDate, Date date) {
			return -1;
		}
	}

	class PreferredCustomer extends Customer {
		void createBill(Date date) {
			double chargeAmount = chargeFor(lastBillDate, date);
			addBill(date, chargeAmount);
		}

		private double chargeFor(Date lastBillDate, Date date) {
			return 0;
		}
	}
	*/
	
	abstract class Customer {
		protected Date lastBillDate;

		public void addBill(Date date, double amount) {
			date.toString();
			String.valueOf(amount);
		}
		
		abstract double chargeFor(Date start, Date end);
		
		void createBill(Date date) {
			double chargeAmount = chargeFor(lastBillDate, date);
			addBill(date, chargeAmount);
		}
	}

	class RegularCustomer extends Customer {
		
		@Override
		double chargeFor(Date lastBillDate, Date date) {
			return -1;
		}
	}

	class PreferredCustomer extends Customer {

		@Override
		double chargeFor(Date lastBillDate, Date date) {
			return 0;
		}
	}
}
