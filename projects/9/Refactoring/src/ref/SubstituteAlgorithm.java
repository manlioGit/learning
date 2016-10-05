package ref;

import static java.util.Arrays.*;

import java.util.List;

public class SubstituteAlgorithm {

	/*START
	String foundPerson(String[] people) {
		for (int i = 0; i < people.length; i++) {
			if (people[i].equals("Don")) {
				return "Don";
			}
			if (people[i].equals("John")) {
				return "John";

			}
			if (people[i].equals("Kent")) {
				return "Kent";
			}
		}
		return "";
	}
	*/
	
	String foundPerson(String[] people) {
		List<String> set = asList("Don", "John", "Kent");
		
		for (int i = 0; i < people.length; i++) {
			if(set.contains(people[i])){
				return people[i];
			}
		}
		return "";
	}
}
