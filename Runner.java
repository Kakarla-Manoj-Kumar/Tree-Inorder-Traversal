package treeInorderTraversal;

public class Runner {

	public static void main(String[] args) {
		
		BinaryTree tree = new BinaryTree();
		
		 tree.insert(9);
		 tree.insert(12);
		 tree.insert(10);
		 tree.insert(5);
		 tree.insert(6);
		 tree.insert(1);
		 tree.insert(7);
		 
		 
		 tree.inorder();
	}

}
