package ch;

import java.util.ArrayList;
import java.util.List;

public class StandardQueue implements Queue {

	private List<Integer> _queue;
	
	public StandardQueue() {
		_queue = new ArrayList<Integer>();
	}
	
	@Override
	public void enqueue(int i) {
		_queue.add(i);
	}

	@Override
	public Integer peek() {
		return _queue.isEmpty() ? null  : _queue.get(0);
	}
	
	@Override
	public void dequeue() {
		if(!_queue.isEmpty()) {
			_queue.remove(0);
		}
	}
	
	@Override
	public Boolean isEmpty() {
		return _queue.isEmpty();
	}
	
	@Override
	public String toString() {
		return _queue.toString();
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((_queue == null) ? 0 : _queue.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StandardQueue other = (StandardQueue) obj;
		if (_queue == null) {
			if (other._queue != null)
				return false;
		} else if (!_queue.equals(other._queue))
			return false;
		return true;
	}
}
