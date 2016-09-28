package smell;

import static smell.Format.*;
 
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
 
    int getProductID() {
        return _productId;
    }
 
    int getImageID() {
        return _imageId;
    }
 
    int getQuantity() {
        return _quantity;
    }
 
    int getUnitPrice() {
        return _unitPrice;
    }
    
    public String render(){
		return 	line("Begin Line Item") +
		    	line("Product = " + getProductID())+
		    	line("Image = " + getImageID()) +
		    	line("Quantity = " + getQuantity()) +
		    	line("Total = " + (getUnitPrice() * getQuantity())) +
		    	line("End Line Item");
    }
}
