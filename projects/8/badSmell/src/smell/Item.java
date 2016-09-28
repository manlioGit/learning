package smell;

import static smell.Format.line;
 
public class Item {
    
	private int _productId;
    private int _imageId;
    private int _quantity;
    private int _unitPrice;
 
    public Item(int prodId, int imageId, int quantity, int unitPrice) {
        _productId = prodId;
        _imageId = imageId;
        _quantity = quantity;
		_unitPrice = unitPrice;
    }
    
    public int total() {
    	return _unitPrice * _quantity;
    }
 
    public String render(){
		return 	line("Begin Line Item") +
		    	line("Product = " + _productId)+
		    	line("Image = " + _imageId) +
		    	line("Quantity = " + _quantity) +
		    	line("Total = " + total()) + 
		    	line("End Line Item");
    }
}
