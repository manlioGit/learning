package ref;

import java.util.Date;

public class IntroduceForeignMethod {

	/*START
	void xxx(Date previousEnd){
		Date newStart = new Date (previousEnd.getYear(),
				previousEnd.getMonth(), previousEnd.getDate() + 1);
	}
	*/
	
	void xxx(Date previousEnd){
		Date newStart = addDayTo(previousEnd);
	}
	
	Date addDayTo(Date date){
		return new Date (date.getYear(), date.getMonth(), date.getDate() + 1);
	}
	
}
