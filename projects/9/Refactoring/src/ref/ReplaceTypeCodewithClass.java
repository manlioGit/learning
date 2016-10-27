package ref;

import java.util.Arrays;
import java.util.List;

public class ReplaceTypeCodewithClass {

	/*START
	class Person {
		public static final int O = 0;
		public static final int A = 1;
		public static final int B = 2;
		public static final int AB = 3;
		private int _bloodGroup;

		public Person(int bloodGroup) {
			_bloodGroup = bloodGroup;
		}

		public void setBloodGroup(int arg) {
			_bloodGroup = arg;
		}

		public int getBloodGroup() {
			return _bloodGroup;
		}
	}
	*/
	
	class Person {
		private BloodGroup _bloodGroup;

		public Person(int bloodGroup) {
			_bloodGroup = BloodGroup.valueBy(bloodGroup);
		}

		public void setBloodGroup(int arg) {
			_bloodGroup = BloodGroup.valueBy(arg);
		}

		public BloodGroup getBloodGroup() {
			return _bloodGroup;
		}
	}
	
	class BloodGroup {
		public static final BloodGroup O = new BloodGroup(0);
		public static final BloodGroup A = new BloodGroup(1);
		public static final BloodGroup B = new BloodGroup(2);
		public static final BloodGroup AB = new BloodGroup(3);
		
		private static final List<BloodGroup> _values = Arrays.asList(O, A, B, AB);
		
		static BloodGroup valueBy(int code){
			return _values.get(code);
		}
		
	}

}
