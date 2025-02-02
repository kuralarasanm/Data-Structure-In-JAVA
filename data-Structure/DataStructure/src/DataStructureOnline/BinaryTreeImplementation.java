package DataStructureOnline;

class TNode{
	int data;
	TNode left;
	TNode right;
	
	TNode(int data){
		this.data=data;
	}
}
class BinaryTrees{
	TNode root;
	BinaryTrees(int data){
		root=new TNode(data);
	}
	public void insertLeft(TNode root,int data) {
		root.left=new TNode(data);
	}
	public void insertRight(TNode root,int data) {
		root.right=new TNode(data);
	}
	public void inorder(TNode root) {
		if(root==null) {
			return;
		}else {
			inorder(root.left);
			System.out.print(root.data+" ");
			inorder(root.right);
		}
	}
}

public class BinaryTreeImplementation {
	public static void main(String[] args) {
		BinaryTrees bt=new BinaryTrees(1);
		bt.insertLeft(bt.root,2);
		bt.insertRight(bt.root , 3);
		bt.insertLeft(bt.root.left , 4);
		bt.insertRight(bt.root.left , 5);
		
		//TRaversal (inorder)
		bt.inorder(bt.root);
	}
}
