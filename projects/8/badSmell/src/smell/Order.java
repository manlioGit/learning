package smell;

import java.io.PrintWriter;
import java.util.List;
 
public class Order {
 
    private List<Item> _items;
 
    public Order(List<Item> items) {
        _items = items;
    }
 
    public void writeOrder(PrintWriter pw) {
        for (Item item : _items) {
        	pw.print(item.render());
		}
        
        pw.println("Order total = " + getTotal());
    }
 
	public int getTotal() {
        int total = 0;
        for (Item item : _items) {
        	total += item.total();
		}
        return total;
    }
}
