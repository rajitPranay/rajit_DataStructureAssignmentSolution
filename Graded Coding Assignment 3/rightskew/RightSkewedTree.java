package com.greatlearning.rightskew;

//import com.greatlearning.rightskew.Driver.Node;

//import com.greatlearning.rightskew.Driver.Node;

public class RightSkewedTree {
	
	Node prevNode = null;
	Node headNode = null;

	// Method to convert BST to right skewed tree
	public void rightSkew(Node root) {
		
		// Base Case
		if (root == null) {
			return;
		}

		// recurse left subtree
		rightSkew(root.left);

		Node rightNode = root.right;
		
		// Condition to check if the root Node
		// of the skewed tree is not defined
		if (headNode == null) {
			headNode = root;
			root.left = null;
			prevNode = root;
		} else {
			prevNode.right = root;
			root.left = null;
			prevNode = root;
		}

		// recurse right subtree
		rightSkew(rightNode);
	}

	// Method to traverse the right	skewed tree
	 public void traverseRightSkewed(Node root) {
		
		if (root == null) {
			return;
		}
		System.out.print(root.key + " ");
		traverseRightSkewed(root.right);
	}

	
}
