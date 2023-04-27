import java.util.*;

public class Node{
	int val;
	Node left, right;

	public Node(int num){
		val = num;
		left = null;
		right = null;
	}

	public void preOrder(Node root){
		if(root == null){
			return;
		}
		System.out.print(root.val + " ");
		preOrder(root.left);
		preOrder(root.right);
	}

	public void inOrder(Node root){
		if(root == null){
			return;
		}
		inOrder(root.left);
		System.out.print(root.val + " ");
		inOrder(root.right);
	}

	public void postOrder(Node root){
		if(root == null){
			return;
		}
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.val + " ");

	}

	public static void main(String... args){
		Node root = new Node(1);
		Node node = new Node(2);
		Node node1 = new Node(9);
		Node node2 = new Node(5);
		Node node3 = new Node(10);
		Node node4 = new Node(15);
		root.left = node;
		root.right = node1;
		root.right.right = node2;
		root.left.left= node3;
		root.left.right = node4;
		System.out.print("PostOrder: ");
		root.postOrder(root);
		System.out.print("\nPreOrder: ");
		root.preOrder(root);
		System.out.print("\nIn-Order: ");
		root.inOrder(root);
		System.out.print("\n");

	}
}

	

	
