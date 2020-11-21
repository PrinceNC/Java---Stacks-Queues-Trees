
public class Stack {
	private Node top;

	public Stack() {
		this.top = null;
	}
	
	public DogTag getTop() {
		if (top == null)
			return null;
		else
			return top.getData();
	}
	
	public Stack(Node top) {
		this.top = top;
	}
	
	public boolean isEmpty() {
		return top == null;
	}
	
	@SuppressWarnings("unused")
	public boolean isFull() {
		Node temp = new Node();
		if (temp == null)
			return true;
		else {
			temp=null;
			return false;
		}
	}
	
	public void push(DogTag tag) {
		if (isFull())
			System.out.println("Stack is full, unable to add Node");
		else {
			Node newTagNode = new Node(tag, null);
			if (isEmpty())
				top = newTagNode;
			else {
				newTagNode.setNext(top);
				top = newTagNode;
			}
		}
	}
	
	public DogTag pop() {
		if (isEmpty())
			System.out.println("Stack is empty, nothing to pop");
		else {
			DogTag data = top.getData();
			@SuppressWarnings("unused")
			Node temp = top;
			top = top.getNext();
			temp = null; // c++ - delete temp
			return data;
		}
		return null;
	}

	
	public void display() {
		Node temp = top;
		while (temp != null) {
			System.out.println(temp.getData());
			temp = temp.getNext();
			
		}
	}
	
	public void destroy() {
		while (pop() != null);
	}
	
}
