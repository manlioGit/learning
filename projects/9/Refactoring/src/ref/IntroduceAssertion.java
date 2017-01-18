package ref;

public class IntroduceAssertion {

	/* START
	public class Project {
		public double getMemberExpenseLimit() {
			return 0;
		}
	}

	class Employee {
		private static final double NULL_EXPENSE = -1.0;
		private double _expenseLimit = NULL_EXPENSE;
		private Project _primaryProject;

		double getExpenseLimit() {
			return (_expenseLimit != NULL_EXPENSE) ? _expenseLimit : _primaryProject.getMemberExpenseLimit();
		}

		boolean withinLimit(double expenseAmount) {
			return (expenseAmount <= getExpenseLimit());
		}
	}
	*/
	
	public class Project {
		public double getMemberExpenseLimit() {
			return 0;
		}
	}

	class Employee {
		private static final double NULL_EXPENSE = -1.0;
		private final double _expenseLimit = NULL_EXPENSE;
		private Project _primaryProject;

		double getExpenseLimit() {
			
			assert(_expenseLimit != NULL_EXPENSE || _primaryProject != null);
						
			return (_expenseLimit != NULL_EXPENSE) ? _expenseLimit : _primaryProject.getMemberExpenseLimit();
		}

		boolean withinLimit(double expenseAmount) {
			return (expenseAmount <= getExpenseLimit());
		}
	}
}
