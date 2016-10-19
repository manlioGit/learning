package ref;

public class PreserveWholeObject {

	/*START
	public class TempRange {

		public int getLow() {
			return 0;
		}
		
		public int getHigh() {
			return 0;
		}
	}

	class Room {
	    boolean withinPlan(HeatingPlan plan) {
	        int low = daysTempRange().getLow();
	        int high = daysTempRange().getHigh();
	        return plan.withinRange(low, high);
	    }

		private TempRange daysTempRange() {
			return new TempRange();
		}
	}
	    
	class HeatingPlan{
	    boolean withinRange (int low, int high) {
	        return (low >= _range.getLow() && high <= _range.getHigh());
	    }
	    private TempRange _range;
	}
	*/
	
	public class TempRange {

		public int getLow() {
			return 0;
		}
		
		public int getHigh() {
			return 0;
		}
		
		public boolean includes(TempRange r){
			return r.getLow() >= getLow() && r.getHigh() <= getHigh();
		}
	}

	class Room {
	    boolean withinPlan(HeatingPlan plan) {
	        return plan.withinRange(daysTempRange());
	    }

		private TempRange daysTempRange() {
			return new TempRange();
		}
	}
	    
	class HeatingPlan{
	    boolean withinRange (TempRange range) {
	        return _range.includes(range);
	    }
	    private TempRange _range;
	}
}
