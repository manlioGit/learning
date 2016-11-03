package ref;

public class InlineClass {

	/*START
	class Person{
	    public String getName() {
	        return _name;
	    }
	    public String getTelephoneNumber(){
	        return _officeTelephone.getTelephoneNumber();
	    }
	    TelephoneNumber getOfficeTelephone() {
	        return _officeTelephone;
	    }
	    private String _name;
	    private TelephoneNumber _officeTelephone = new TelephoneNumber();
	}
	
	class TelephoneNumber{
	    public String getTelephoneNumber() {
	        return ("(" + _areaCode + ") " + _number);
	    }
	    String getAreaCode() {
	        return _areaCode;
	    }
	    void setAreaCode(String arg) {
	        _areaCode = arg;
	    }
	    String getNumber() {
	        return _number;
	    }
	    void setNumber(String arg) {
	        _number = arg;
	    }
	    private String _number;
	    private String _areaCode;
	}
	*/
	
	class Person{
	    public String getName() {
	        return _name;
	    }
	    
	    public String getTelephoneNumber(){
	        return ("(" + _areaCode + ") " + _number);
	    }
	    
	    String getAreaCode() {
	        return _areaCode;
	    }
	    void setAreaCode(String arg) {
	        _areaCode = arg;
	    }
	    
	    String getNumber() {
	        return _number;
	    }
	    void setNumber(String arg) {
	        _number = arg;
	    }
	    
	    private String _name;
	    private String _number;
	    private String _areaCode;
	}
}
