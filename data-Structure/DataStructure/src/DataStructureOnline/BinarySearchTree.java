package DataStructureOnline;

class TreeNode {
	int data;
	TreeNode left;
	TreeNode right;

	public TreeNode(int data) {
		this.data = data;
	}
}

class BST {
	TreeNode root;

	public BST(int data) {
		root = new TreeNode(data);
	}

	public void insert(int data) {
		insertNode(root, data);
	}

	public TreeNode insertNode(TreeNode root, int data) {
		if (root == null) {
			return new TreeNode(data);
		}
		if (data < root.data) {
			root.left = insertNode(root.left, data);
		} else {
			root.right = insertNode(root.right, data);
		}
		return root;
	}

	public void inOrder(TreeNode root) {
		if (root == null) {
			return;
		} else {
			inOrder(root.left);
			System.out.print(root.data + " ");
			inOrder(root.right);
		}
	}

	public void searchNode(TreeNode root, int data) {
		if (root == null) {
			System.out.println("element not found");
			return;
		}
		if (data == root.data) {
			System.out.println("found");
			return;
		} else if (data < root.data) {
			searchNode(root.left, data);
		} else {
			searchNode(root.right, data);
		}
	}

	public int findMinimum(TreeNode root) {
		if (root == null) {
			System.out.println("no tree exists");
		} else if (root.left == null) {
			return root.data;
		}
		return findMinimum(root.left);
	}

	public int findMaximum(TreeNode root) {
		if (root == null) {
			System.out.println("no tree exists");
		} else if (root.right == null) {
			return root.data;
		}
		return findMaximum(root.right);
	}
	public TreeNode deleteNode(TreeNode root,int value) {
		if(root==null) {
			System.out.println("No tree exists");
			return root;
		}
		if(value<root.data) {
			root.left=deleteNode(root.left, value);
		}else if(value>root.data){
			root.right=deleteNode(root.right, value);
		}else {
			if(root.right==null) {
				return root.left;
			}else if(root.left==null) {
				return root.right;
			}
				root.data=findMinimum(root.right);	
				root.right=deleteNode(root.right, root.data);
		}
		return root;
	}
}

public class BinarySearchTree {
	public static void main(String[] args) {
		// 50,30,10,60,55
		BST bst = new BST(50);
		bst.insert(30);
		bst.insert(10);
		bst.insert(60);
		bst.insert(55);
		bst.inOrder(bst.root);
		// searching
		bst.searchNode(bst.root, 60);
		// find min
		System.out.println(bst.findMinimum(bst.root));
		// find max
		System.out.println(bst.findMaximum(bst.root));
		bst.deleteNode(bst.root, 10);
		bst.inOrder(bst.root);
	}
}
