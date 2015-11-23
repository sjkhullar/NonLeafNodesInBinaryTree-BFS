package org.learn.PrepareTree;

public class Node {
	public int data;
	public Node left;
	public Node right;

	public Node(int num) {
		this.data = num;
		this.left = null;
		this.right = null;
	}

	public Node() {
		this.left = null;
		this.right = null;
	}
}