
public class Node {
	private DogTag data;
	private Node next;
	
	public Node() {
		this.data = null;
		this.next = null;
	}
	
	public Node(DogTag data, Node next) {
		this.data = data;
		this.next = next;
	}

	public DogTag getData() {
		return data;
	}

	public void setData(DogTag data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return "Node [data=" + data + ", next=" + (next ==null?"null" : "not null") + "]";
	}
	
	
	
	
}
