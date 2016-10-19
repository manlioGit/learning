package ref;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IntroduceParameterObject {

	/*START
	  class Entry {
		  
	    Entry (double value, Date chargeDate) {
	        _value = value;
	        _chargeDate = chargeDate;
	    }
	    
	    Date getDate(){
	        return _chargeDate;
	    }
	    
	    double getValue(){
	        return _value;
	    }
	    
	    private Date _chargeDate;
	    private double _value;
	  }
	  
	  class Account{
	    double getFlowBetween (Date start, Date end) {
	        double result = 0;
	        Enumeration e = _entries.elements();
	        while (e.hasMoreElements()) {
	            Entry each = (Entry) e.nextElement();
	            if (each.getDate().equals(start) ||
	                each.getDate().equals(end) ||
	                 (each.getDate().after(start) && each.getDate().before(end)))
	            {
	            }
	        }
	        return result;
	    }
	    
	    private Vector _entries = new Vector();
	  }
	  
	  class Client {
		  void doStuff() {
			  new Account().getFlowBetween(new Date(), new Date());
		  }
	  }
	*/
	
	  class Entry {
		  
	    Entry (double value, Date chargeDate) {
	        _value = value;
	        _chargeDate = chargeDate;
	    }
	    
	    Date getDate(){
	        return _chargeDate;
	    }
	    
	    double getValue(){
	        return _value;
	    }
	    
	    private Date _chargeDate;
	    private double _value;
	  }
	  
	  class Account{
	    double getFlowBetween (DateRange range) {
	        double result = 0;
	        for (Entry entry : _entries) {
	        	if (range.hasLimitOf(entry) || range.fallInto(entry))
	            {
        			result+= entry.getValue();
	            }
			}
	        
	        return result;
	    }
	    
	    private List<Entry> _entries = new ArrayList<Entry>();
	  }
	  
	  class DateRange{
		private final Date _start;
		private final Date _end;

		public DateRange(Date start, Date end) {
			_start = start;
			_end = end;
		}

		public Date getStart() {
			return _start;
		}

		public Date getEnd() {
			return _end;
		}
		
		public boolean hasLimitOf(Entry e){
			return e.getDate().equals(_start) ||
	                e.getDate().equals(_end);
		}
		
		public boolean fallInto(Entry e){
			return e.getDate().after(_start) && e.getDate().before(_end);
		}
	  }
	  
	  class Client {
		  void doStuff() {
			  new Account().getFlowBetween(new DateRange(new Date(), new Date()));
		  }
	  }
}
