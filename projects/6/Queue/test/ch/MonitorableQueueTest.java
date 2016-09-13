package ch;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class MonitorableQueueTest {

	@Test
	public void longestMarker() throws Exception {
		
		MonitorableQueue queue = new MonitorableQueue();
		
		queue.enqueue(1);
		queue.enqueue(1);
		
		queue.dequeue();
		
		assertThat(queue.longestMarker(), is(2));
	}
}
