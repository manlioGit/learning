package ref;

public class ExtractSubClass {

	
	/*START
	 class JobItem {
		
		public JobItem(int unitPrice, int quantity, boolean isLabor, Employee employee) {
			_unitPrice = unitPrice;
			_quantity = quantity;
			_isLabor = isLabor;
			_employee = employee;
		}

		public int getTotalPrice() {
			return getUnitPrice() * _quantity;
		}

		public int getUnitPrice() {
			return (_isLabor) ? _employee.getRate() : _unitPrice;
		}

		public int getQuantity() {
			return _quantity;
		}

		public Employee getEmployee() {
			return _employee;
		}

		private int _unitPrice;
		private int _quantity;
		private Employee _employee;
		private boolean _isLabor;
	}

	class Employee {
		public Employee(int rate) {
			_rate = rate;
		}

		public int getRate() {
			return _rate;
		}

		private int _rate;
	}
	*/
	
	class JobItem {
		
		public JobItem(int unitPrice, int quantity, Employee employee) {
			_unitPrice = unitPrice;
			_quantity = quantity;
			_employee = employee;
		}

		public int getTotalPrice() {
			return getUnitPrice() * _quantity;
		}

		public int getUnitPrice() {
			return _unitPrice;
		}

		public int getQuantity() {
			return _quantity;
		}

		public Employee getEmployee() {
			return _employee;
		}

		private int _unitPrice;
		private int _quantity;
		private Employee _employee;
	}

	class JobLaborItem extends JobItem{

		public JobLaborItem(int quantity, Employee employee) {
			super(-1, quantity, employee);
		}
		
		@Override
		public int getUnitPrice() {
			return getEmployee().getRate();
		}
	}
	
	class Employee {
		public Employee(int rate) {
			_rate = rate;
		}

		public int getRate() {
			return _rate;
		}

		private int _rate;
	}
}
