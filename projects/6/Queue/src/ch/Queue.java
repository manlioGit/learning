package ch;

public interface Queue {

	void enqueue(int i);

	void dequeue();

	Integer peek();
	
	Boolean isEmpty(); 
}
