
public class Driver {

	public static void main(String[] args) {		
		//Create new stack
		Stack stack = new Stack();
		
		//Push nodes into stack
		stack.push(new DogTag(1, "Red Factory ", 200));
		stack.push(new DogTag(2, "Blue Factory ", 300));
		stack.push(new DogTag(3, "Yellow Factory ", 400));
		stack.display();

		//Create temp stack
		Stack temp = new Stack();
		
		while (stack.getTop() != null)
			temp.push(stack.pop());
		
		//Assign "temp" to "stack"
		stack = temp;
		temp = null; // free memory
		System.out.println("\n");
		stack.display();
		
		BinarySearchTree tree = new BinarySearchTree();
		tree.insert(new DogTag(1, "Red Factory ", 200));
		tree.insert(new DogTag(2, "Blue Factory ", 300));
		tree.insert(new DogTag(3, "Yellow Factory ", 400));
		
		for (int i = 6; i>0; i--) {
			DogTag data = new DogTag(i, "Tag ", i*500);
			System.out.println("Adding Tag : " + data);
			tree.insert(data);
		}
		
		System.out.println("Displaying tree");
		tree.display();
		
		
		DogTag searchResult = tree.search(1000);
		if (searchResult == null)
			System.out.println("Did not find 1000");
		else
			System.out.println("Found " + searchResult);
		
		System.out.println("-----Destroying tree");
		tree.display();
	}
}
