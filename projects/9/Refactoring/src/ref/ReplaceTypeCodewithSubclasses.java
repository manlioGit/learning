package ref;

public class ReplaceTypeCodewithSubclasses {

	/*START
	class Employee {
		private int _type;
		static final int ENGINEER = 0;
		static final int SALESMAN = 1;
		static final int MANAGER = 2;

		Employee(int type) {
			_type = type;
		}
	}
	*/
	
	interface Employee {
		int getType();
	}
	
	class Engineer implements Employee {
		@Override
		public int getType() {
			return 0;
		}
	}
	
	class SalesMan implements Employee {
		@Override
		public int getType() {
			return 1;
		}
	}
	
	class Manager implements Employee {
		@Override
		public int getType() {
			return 2;
		}
	}
}
