package ref;

public class HideDelegate {

	/*START
	class Person {
		Department _department;

		public Department getDepartment() {
			return _department;
		}

		public void setDepartment(Department arg) {
			_department = arg;
		}
	}

	class Department {

		private Person _manager;

		public Department(Person manager) {
			_manager = manager;
		}

		public Person getManager() {
			return _manager;
		}
	}
	
	void xxx(){
		Person manager = new Department(new Person()).getManager();
	}
	*/
	
	class Person {
		Department _department;

		public void setDepartment(Department arg) {
			_department = arg;
		}
		
		public Person getManager(){
			return _department.getManager();
		}
	}

	class Department {

		private Person _manager;

		public Department(Person manager) {
			_manager = manager;
		}

		public Person getManager() {
			return _manager;
		}
	}
	
	void xxx(){
		Person manager = new Person().getManager();
	}
}
