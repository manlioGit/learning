package ref;

import java.util.Date;

public class DecomposeConditional {

	
	/*START
	if(date.before (SUMMER_START) || date.after(SUMMER_END))
          charge = quantity * _winterRate + _winterServiceCharge;
      else charge = quantity * _summerRate;
	*/
	
	class X{
		
		private final Date SUMMER_START = null;
		private final Date SUMMER_END = null;
		private static final double WINTER_RATE = 0.1;
		private static final double WINTER_SERVICE_CHARGE = 0.2;
		private static final double SUMMER_RATE = 0.3;
		private Date _date;
		private int _quantity;

		public X(Date date, int quantity) {
			_date = date;
			_quantity = quantity;
		}
		
		double calc() {
			return isWinter() ? chargeWith(WINTER_RATE, WINTER_SERVICE_CHARGE) : chargeWith(SUMMER_RATE, 0); 
		}

		private double chargeWith(double rate, double extra) {
			return _quantity * rate + extra;
		}

		private boolean isWinter() {
			return _date.before (SUMMER_START) || _date.after(SUMMER_END);
		}
	}
}
