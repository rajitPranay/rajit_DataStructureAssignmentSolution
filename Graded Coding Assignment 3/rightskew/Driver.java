package com.greatlearning.rightskew;

public class Driver {

	public static void main(String[] args) {
		Node root;
		root = new Node(50);
		root.left = new Node(30);
		root.right = new Node(60);
		root.left.left = new Node(10);
		root.right.left = new Node(55);

		RightSkewedTree rst = new RightSkewedTree();

		rst.rightSkew(root);
		Node rootRST = rst.headNode;
		rst.traverseRightSkewed(rootRST);
	}

}
