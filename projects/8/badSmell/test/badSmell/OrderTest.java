package badSmell;

import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static smell.Format.line;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

import smell.Item;
import smell.Order;


public class OrderTest {

	private Order _order;

	@Before
	public void setUp() {
		_order = new Order(asList(new Item(1, 1, 1, 10), new Item(2, 2, 2, 10)));
	}
	
	@Test
	public void getTotal() {
		assertThat(_order.getTotal(),is(30));
	}
	
	@Test
	public void writeOrder() throws Exception {
		
		FakeWriter writer = new FakeWriter(tempFile());

		String expectedContent = line("Begin Line Item") +
								 line("Product = 1") +
								 line("Image = 1") +
								 line("Quantity = 1") +
								 line("Total = 10") +
								 line("End Line Item") +
								 line("Begin Line Item") +
								 line("Product = 2") +
								 line("Image = 2") +
								 line("Quantity = 2") +
								 line("Total = 20") +
								 line("End Line Item") +
								 line("Order total = 30");
		
		_order.writeOrder(writer);
		
		assertThat(writer.getContent(), is(expectedContent));
	}

	private File tempFile() throws IOException {
		return File.createTempFile("order", ".test");
	}
}
