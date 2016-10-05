package ref;

public class ExtractClass {

	/*START
	class Person {
		public String getName() {
			return _name;
		}

		public String getTelephoneNumber() {
			return ("(" + _officeAreaCode + ") " + _officeNumber);
		}

		String getOfficeAreaCode() {
			return _officeAreaCode;
		}

		void setOfficeAreaCode(String arg) {
			_officeAreaCode = arg;
		}

		String getOfficeNumber() {
			return _officeNumber;
		}

		void setOfficeNumber(String arg) {
			_officeNumber = arg;
		}

		private String _name;
		private String _officeAreaCode;
		private String _officeNumber;
	}
	*/
	
	class Person {
		
		private String _name;
		private Office _office;
		
		public String getName() {
			return _name;
		}

		public String getTelephoneNumber() {
			return _office.getTelephoneNumber();
		}

		String getOfficeAreaCode() {
			return _office.getOfficeAreaCode();
		}
	}
	
	class Office {
		
		private String _officeAreaCode;
		private String _officeNumber;
		
		public String getTelephoneNumber() {
			return ("(" + _officeAreaCode + ") " + _officeNumber);
		}

		String getOfficeAreaCode() {
			return _officeAreaCode;
		}

		void setOfficeAreaCode(String arg) {
			_officeAreaCode = arg;
		}

		String getOfficeNumber() {
			return _officeNumber;
		}

		void setOfficeNumber(String arg) {
			_officeNumber = arg;
		}
		
	}
}
