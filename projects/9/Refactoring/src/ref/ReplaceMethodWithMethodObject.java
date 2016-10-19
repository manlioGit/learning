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
			return new AccountCalculator(this, inputVal, quantity, yearToDate).compute();
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
		private int _inputVal;
		private int _quantity;
		private int _yearToDate;
		
		public AccountCalculator(Account a, int inputVal, int quantity, int yearToDate) {
			_account = a;
			_inputVal = inputVal;
			_quantity = quantity;
			_yearToDate = yearToDate;
		}
		
		public int compute(){
			_importantValue1 = (_inputVal * _quantity) + _account.delta();
			_importantValue2 = (_inputVal * _yearToDate) + 100;
			if((_yearToDate -_importantValue1) > 100 )
				_importantValue2 -= 20;
			
			_importantValue3 = _importantValue2 * 7;
			// and so on.
			return _importantValue3 - 2 * _importantValue1;
		}
		
	 }
}
