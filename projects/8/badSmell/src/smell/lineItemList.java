package smell;

import java.util.Vector;
 
public class lineItemList {
    private Vector LIList;
 
    public void setLineItems(Vector lineItems) {
        LIList = lineItems;
    }
 
    Vector getLineItems() {
        return LIList;
    }
}
