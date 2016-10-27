package ref;



public class ReplaceTypeCodewithStateStrategyAlternative {

	
	/*START
	 class Employee {
		private int _type;
		private int _monthlySalary;
		private int _commission;
		private int _bonus;
		static final int ENGINEER = 0;
		static final int SALESMAN = 1;
		static final int MANAGER = 2;

		Employee(int type) {
			_type = type;
		}

		int payAmount() {
			switch (_type) {
				case ENGINEER:
					return _monthlySalary;
				case SALESMAN:
					return _monthlySalary + _commission;
				case MANAGER:
					return _monthlySalary + _bonus;
				default:
					throw new RuntimeException("Incorrect Employee");
			}
		}
	} 
	 */
	
	abstract class Employee {

		static final int ENGINEER = 0;
		static final int SALESMAN = 1;
		static final int MANAGER = 2;

		abstract int payAmount();
	}
	
	class Engineer extends Employee {
		
		private int _salary;

		public Engineer(int salary) {
			_salary = salary;
		}
		
		@Override
		int payAmount() {
			return _salary;
		}
	}
	
	class SalesMan extends Employee {
		
		private int _salary;
		private int _commission;

		public SalesMan(int salary, int commission) {
			_salary = salary;
			_commission = commission;
		}
		
		@Override
		public int payAmount() {
			return _salary + _commission;
		}
	}
	
	class Manager extends Employee {

		private int _salary;
		private int _bonus;
		
		public Manager(int salary, int bonus) {
			_salary = salary;
			_bonus = bonus;
		}
		
		@Override
		public int payAmount() {
			return _salary + _bonus;
		}
	}
}
