package ref;

import static java.util.Arrays.*;

import java.util.List;

public class ReplaceTypeCodewithStateStrategy {

	
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
	
	class Employee {
		private int _monthlySalary;
		private int _commission;
		private int _bonus;
		static final int ENGINEER = 0;
		static final int SALESMAN = 1;
		static final int MANAGER = 2;

		private int _type;
		
		Employee(int type) {
			_type = type;
		}

		int payAmount() {
			
			List<EmployeeType> employee = asList(new Engineer(_monthlySalary), new SalesMan(_monthlySalary, _commission), new Manager(_monthlySalary, _bonus));
			for (EmployeeType employeeType : employee) {
				if(employeeType.matches(_type)){
					return employeeType.pay();
				}
			}
			
			throw new RuntimeException("Incorrect Employee"); 
		}
	}

	interface EmployeeType {
		
		int pay();
		boolean matches(int code);
	}
	
	class Engineer implements EmployeeType {
		
		private int _salary;

		public Engineer(int salary) {
			_salary = salary;
		}
		
		@Override
		public int pay() {
			return _salary;
		}

		@Override
		public boolean matches(int code) {
			return Employee.ENGINEER == code;
		}

	}
	
	class SalesMan implements EmployeeType {
		
		private int _salary;
		private int _commission;

		public SalesMan(int salary, int commission) {
			_salary = salary;
			_commission = commission;
		}
		
		@Override
		public int pay() {
			return _salary + _commission;
		}

		@Override
		public boolean matches(int code) {
			return Employee.SALESMAN == code;
		}
	}
	
	class Manager implements EmployeeType {

		private int _salary;
		private int _bonus;
		
		public Manager(int salary, int bonus) {
			_salary = salary;
			_bonus = bonus;
		}
		
		@Override
		public int pay() {
			return _salary + _bonus;
		}

		@Override
		public boolean matches(int code) {
			return Employee.MANAGER == code;
		}
	}
}
