package com.greatlearning.rightskew;

//Class of the node
class Node {
	int key;
	Node left, right;
	
	// constructor to create new node
	Node(int item) {
		key = item;
		left = right = null;
	}
}
