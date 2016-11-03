package ref;

public class ReplaceConditionalWithPolymorphism {

	/*START
	abstract class EmployeeType {
		static final int ENGINEER = 0;
		static final int SALESMAN = 1;
		static final int MANAGER = 2;

		static EmployeeType newType(int code) {
			switch (code) {
			case ENGINEER:
				return new Engineer();
			case SALESMAN:
				return new Salesman();
			case MANAGER:
				return new Manager();
			default:
				throw new IllegalArgumentException("Incorrect Employee Code");
			}
		}

		abstract int getTypeCode();
	}

	class Engineer extends EmployeeType {
		int getTypeCode() {
			return EmployeeType.ENGINEER;
		}
	}

	class Manager extends EmployeeType {
		int getTypeCode() {
			return EmployeeType.MANAGER;
		}
	}

	class Salesman extends EmployeeType {
		int getTypeCode() {
			return EmployeeType.SALESMAN;
		}
	}

	class Employee {
		private EmployeeType _type;
		private int _monthlySalary;
		private int _commission;
		private int _bonus;

		Employee(int type) {
			_type = EmployeeType.newType(type);
		}

		int payAmount() {
			switch (getType()) {
			case EmployeeType.ENGINEER:
				return _monthlySalary;
			case EmployeeType.SALESMAN:
				return _monthlySalary + _commission;
			case EmployeeType.MANAGER:
				return _monthlySalary + _bonus;
			default:
				throw new RuntimeException("Incorrect Employee");
			}
		}

		private int getType() {
			return _type.getTypeCode();
		}
	}

	 */

	abstract class EmployeeType {
		static final int ENGINEER = 0;
		static final int SALESMAN = 1;
		static final int MANAGER = 2;

		static EmployeeType newType(int code) {
			switch (code) {
			case ENGINEER:
				return new Engineer();
			case SALESMAN:
				return new Salesman();
			case MANAGER:
				return new Manager();
			default:
				throw new IllegalArgumentException("Incorrect Employee Code");
			}
		}
		
		abstract int payAmount(Employee emp);
		abstract int getTypeCode();
	}

	class Engineer extends EmployeeType {
		int getTypeCode() {
			return EmployeeType.ENGINEER;
		}
		
		int payAmount(Employee emp) {
			return emp.getMonthSalary();
		}
	}

	class Manager extends EmployeeType {
		int getTypeCode() {
			return EmployeeType.MANAGER;
		}
		
		int payAmount(Employee emp) {
			return emp.getMonthSalary() + emp.getBonus();
		}
	}

	class Salesman extends EmployeeType {
		int getTypeCode() {
			return EmployeeType.SALESMAN;
		}
		
		int payAmount(Employee emp) {
			return emp.getMonthSalary() + emp.getCommission();
		}
	}

	class Employee {
		private EmployeeType _type;
		private int _monthlySalary;
		private int _commission;
		private int _bonus;

		Employee(int type) {
			_type = EmployeeType.newType(type);
		}

		public int getBonus() {
			return _bonus;
		}

		public int getCommission() {
			return _commission;
		}

		public int getMonthSalary() {
			return _monthlySalary;
		}

		int payAmount() {
			return _type.payAmount(this);
		}
	}
}
