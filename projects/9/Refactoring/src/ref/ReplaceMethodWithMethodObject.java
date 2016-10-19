package ref;

public class ReplaceMethodWithMethodObject {

	/*START
	 class Account{
	    int gamma (int inputVal, int quantity, int yearToDate) {
	    	int importantValue1 = (inputVal * quantity) + delta();
			int importantValue2 = (inputVal * yearToDate) + 100;
			if((yearToDate - importantValue1) > 100 )
				importantValue2 -= 20;
			
			int importantValue3 = importantValue2 * 7;
			// and so on.
			return importantValue3 - 2 * importantValue1;
	    }

		private int delta() {
			return 0;
		}
	 }
	 */
	
	  class Account{
	    int gamma (int inputVal, int quantity, int yearToDate) {
	    	int importantValue1 = (inputVal * quantity) + delta();
			int importantValue2 = (inputVal * yearToDate) + 100;
			if((yearToDate - importantValue1) > 100 )
				importantValue2 -= 20;
			
			int importantValue3 = importantValue2 * 7;
			// and so on.
			return importantValue3 - 2 * importantValue1;
			
//			return new AccountCalculator().value(this);
	    }

		private int delta() {
			return 0;
		}
	 }
	  
	 class AccountCalculator {
		 
		private Account _account;
		private int _importantValue1;
		private int _importantValue2;
		private int _importantValue3;
		 
		public AccountCalculator(Account a, int inputVal, int quantity, int yearToDate) {
			_account = a;
		}
		
	 }
}
