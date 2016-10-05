package ref;

public class ReplaceTempWithQuery {

	/*START
	 double getPrice() {
        int basePrice = _quantity * _itemPrice;
        double discountFactor;
        if (basePrice > 1000) discountFactor = 0.95;
        else discountFactor = 0.98;
        return basePrice * discountFactor;
    }
	 */
	
	private int _quantity;
	private int _itemPrice;

	double getPrice() {
        return basePrice() * discountFactor();
    }

	private double discountFactor() {
		return basePrice() > 1000 ? 0.95 : 0.98;
	}

	private int basePrice() {
		return  _quantity * _itemPrice;
	}
}
