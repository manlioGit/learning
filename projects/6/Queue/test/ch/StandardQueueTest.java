package ch;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;

import org.junit.Before;
import org.junit.Test;

public class StandardQueueTest {

	private StandardQueue _queue;

	@Before
	public void setUp(){
		_queue = new StandardQueue();
	}
	
	@Test
	public void peekReturnsNullValueWhenEmpty() throws Exception {
		assertThat(_queue.peek(), is(nullValue()));
	}
	
	@Test
	public void enqueue() throws Exception {
		_queue.enqueue(1);
		_queue.enqueue(1);
		
		StandardQueue other = new StandardQueue();
		other.enqueue(1);
		other.enqueue(1);
		
		assertThat(_queue, is(other));
	}
	
	@Test
	public void dequeue() throws Exception {
		_queue.enqueue(1);
		_queue.enqueue(2);
		
		_queue.dequeue();
		
		assertThat(_queue.peek(), is(2));
	}

	@Test
	public void peek() throws Exception {
		
		_queue.enqueue(1);
		
		assertThat(_queue.peek(), is(1));
	}
	
	@Test
	public void isEmpty() throws Exception {
		assertThat(_queue.isEmpty(), is(true));
	}
}
