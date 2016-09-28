package badSmell;

import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.List;
import java.util.Vector;

import org.junit.Before;
import org.junit.Test;

import smell.Order;
import smell.lineItem;
import smell.lineItemList;


public class OrderTest {

	private lineItem _item1;
	private lineItem _item2;
	private lineItemList _lineItemList;

	@Before
	public void setUp() {
		_item1 = new lineItem(1, 1, 1);
		_item1.setUnitPrice(10);
		
		_item2 = new lineItem(2, 2, 2);
		_item2.setUnitPrice(10);

		_lineItemList = new lineItemList();
		_lineItemList.setLineItems(new Vector<>(asList(_item1, _item2)));
	}
	
	@Test
	public void getTotal() {
		assertThat(new Order(_lineItemList).getTotal(),is(30));
	}
	
	@Test
	public void writeOrder() throws Exception {
		List<String> expectedContent = asList(
				"Begin Line Item", 
				"Product = 1",
				"Image = 1",
				"Quantity = 1",
				"Total = 10",
				"End Line Item",
				"Begin Line Item",
				"Product = 2",
				"Image = 2",
				"Quantity = 2",
				"Total = 20",
				"End Line Item",
				"Order total = 30"
			);
		
		FakeWriter writer = new FakeWriter("xxx");
		new Order(null).writeOrder(new Order(_lineItemList), writer);
		
		assertThat(writer.getContent(), is(expectedContent));
	}
	
	@Test
	public void saveOrder() throws Exception {
		String expectedStatement = "INSERT INTO T_ORDER "
				+ "(AUTHORIZATION_CODE, SHIPMETHOD_ID, USER_ID, ADDRESS_ID) "
				+ "VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

		FakeConnection c = new FakeConnection();
		
		new Order(_lineItemList).saveOrder(c);
		
		assertThat(c.getStatement(), is(expectedStatement));
	}
}
