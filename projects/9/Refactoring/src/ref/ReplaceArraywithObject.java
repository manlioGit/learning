package ref;

public class ReplaceArraywithObject {

	/*START
	class x {
		
		void exec() {
			String[] row = new String[3];
			row [0] = "Liverpool";
			row [1] = "15";
			
			String name = row[0];
			int wins = Integer.parseInt(row[1]);
			
		}
	}
	*/
	
	
	class x {
		
		void exec() {
			String[] row = new String[3];
			row [0] = "Liverpool";
			row [1] = "15";
			
			Bet bet = new Bet("Liverpool", 15);
			
		}
	}
	
	class Bet{
		
		private String _name;
		private int _wins;
		
		public Bet(String name, int wins) {
			_name = name;
			_wins = wins;
		}
		
		public String getName() {
			return _name;
		}
		
		public int getWins() {
			return _wins;
		}
	}
}
