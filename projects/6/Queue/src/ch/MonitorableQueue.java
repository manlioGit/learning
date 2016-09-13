package ch;

public class MonitorableQueue implements Queue {

	private Queue _queue;
	private int _currentSize;
	private int _marker;
	
	public MonitorableQueue() {
		_queue = new StandardQueue();
	}
	
	@Override
	public void enqueue(int i) {
		if(++_currentSize > _marker){
			_marker = _currentSize;
		}
			
		_queue.enqueue(i);
	}

	@Override
	public void dequeue() {
		_currentSize--;
		
		_queue.dequeue();
	}

	@Override
	public Integer peek() {
		return _queue.peek();
	}

	@Override
	public Boolean isEmpty() {
		return _queue.isEmpty();
	}

	public Integer longestMarker() {
		return _marker;
	}
}
