package ref;

public class RemoveSettingMethod {

	/*START
	class Account {
		private String _id;

		Account(String id) {
			setId(id);
		}

		void setId(String arg) {
			_id = "ZZ" + arg;
		}
	}
	
	class InterestAccount extends Account {
	   private double _interestRate;
	   InterestAccount (String id, double rate) {
	       setId(id);
	       _interestRate = rate;
	   }
	
	 }
	*/
	
	class Account {
		private final String _id;

		Account(String id) {
			_id = "ZZ" + id;
		}
	}
	
	 class InterestAccount extends Account {
	   private final double _interestRate;
	   
	   public InterestAccount (String id, double rate) {
	       super(id);
	       _interestRate = rate;
	   }
	 }

}
