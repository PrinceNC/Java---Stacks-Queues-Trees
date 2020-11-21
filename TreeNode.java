
public class TreeNode {
	private DogTag data;
	private TreeNode left;
	private TreeNode right;
	
	public TreeNode(DogTag data, TreeNode left, TreeNode right) {
		this.data = data;
		this.left = left;
		this.right = right;
	}
	
	public TreeNode(DogTag data) {
		super();
		this.data = data;
	}
	
	public TreeNode() {
		super();
	}
	
	public DogTag getData() {
		return data;
	}

	public void setData(DogTag data) {
		this.data = data;
	}

	public TreeNode getLeft() {
		return left;
	}

	public void setLeft(TreeNode left) {
		this.left = left;
	}

	public TreeNode getRight() {
		return right;
	}

	public void setRight(TreeNode right) {
		this.right = right;
	}
	
	public void destroy() {
		System.out.println("Checking " + data);
		if (left != null) {
			left.destroy();
			left = null;
		}
		if (right != null) {
			right.destroy();
			right = null;
		}
		System.out.println("Destroy " + data);
		data = null;
	}
}
