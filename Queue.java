
public class Queue {
	private Node front;

	public Queue() {
		this.front = null;
	}
	
	public Queue(Node node) {
		this.front = node;
	}
	
	public DogTag getFront() {
		if (front == null)
			return null;
		else
			return front.getData();
	}
	
	public boolean isEmpty() {
		return front == null;
	}
	
	@SuppressWarnings("unused")
	public boolean isFull() {
		Node temp = new Node();
		if (temp == null)
			return true;
		else {
			temp = null;
			return false;
		}
	}
	
	public void enqueue(DogTag tag) { //add to back
		if (isFull()) {
			System.out.println("Queue is full, unable to add");
		} else {
			Node next = new Node(tag, null);
			if (isEmpty())
				front = next;
			else {
				Node temp = front;
				while (temp.getNext() != null)
					temp = temp.getNext();
				temp.setNext(next);
			}
		}
	}
	
	public DogTag dequeue() {
		if (isEmpty()) {
			System.out.println("Queue is empty, nothing to pop");
		} else {
			DogTag data = front.getData();
			@SuppressWarnings("unused")
			Node temp = front;
			front = front.getNext();
			temp = null; // c++ - delete temp
			return data;
		}
		return null;
	}

	public void display() {
		Node temp = front;
		while (temp != null) {
			System.out.println(temp.getData());
			temp = temp.getNext();
		}
	}
	
	public void destroy() {
		while (dequeue() != null);
	}
	
}
