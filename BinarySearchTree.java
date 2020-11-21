
public class BinarySearchTree {
	private TreeNode root;
	
	public BinarySearchTree() {
		root = null;
	}
	
	public boolean isEmpty() {
		return root == null;
	}
	
	@SuppressWarnings("unused")
	public boolean isFull() {
		TreeNode temp = new TreeNode();
		
		if (temp == null)
			return true;
		else {
			temp = null;
			return false;
		}
	}
	
	public void insert(DogTag data) {
		if (isFull())
			System.out.println("Tree is full, unable to insert");
		else {
			if (isEmpty())
				root = new TreeNode(data);
			else
				insertRecursively(data, root);
		}
	}

	protected void insertRecursively(DogTag data, TreeNode parentNode) {
		if (data.getId() < parentNode.getData().getId()) {
			//Insert on left
			if (parentNode.getLeft() == null) {//nothing on left
				TreeNode next = new TreeNode(data);
				parentNode.setLeft(next);				
			}
			else {
				//call insertRecursively with left node as new parentNode
				//i.e traversing to the left portion'
				insertRecursively(data, parentNode.getLeft());
			}
		}else {
			//Insert on the right
			if (parentNode.getRight() == null) {//nothing on right
				TreeNode next = new TreeNode(data);
				parentNode.setRight(next);				
			}
			else {
				//call insertRecursively with left node as new parentNode
				//i.e traversing to the left portion'
				insertRecursively(data, parentNode.getRight());
			}
			
		}
		
	}

	public void display() {
		displayInOrder(root);
	}

	protected void displayInOrder(TreeNode parentNode) {
		if (parentNode == null) return; //prematurely exit function if parent is null
		displayInOrder(parentNode.getLeft());
		System.out.println(parentNode.getData());
		displayInOrder(parentNode.getRight());
	}
	
	protected void displayPreOrder(TreeNode parentNode) {
		if (parentNode == null) return; //prematurely exit function if parent is null
		System.out.println(parentNode.getData());
		displayPreOrder(parentNode.getLeft());
		displayPreOrder(parentNode.getRight());
	}
	
	public DogTag search(int id) {
		return searchRecursively(id, root);
	}

	protected DogTag searchRecursively(int id, TreeNode parentNode) {
		if (parentNode == null) return null; //prematurely exit function if parent is null
		//if data is found it will be stored in 'data'
		if (id == parentNode.getData().getId())
			return parentNode.getData();
		
		//is it on the left?
		if (id < parentNode.getData().getId())
			return searchRecursively(id, parentNode.getLeft());
		else
			//search right
			return searchRecursively(id, parentNode.getRight());
	}
	
	public void destroy() {
		if (root != null) {
			root.destroy();
			root = null;
		}
	}
	
}