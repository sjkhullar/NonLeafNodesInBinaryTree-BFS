package org.learn.PrepareTree;

import java.util.LinkedList;
import java.util.Queue;

public class Tree {

	public Tree() {
	}

	public void insert(Node root, int info) {
		Queue<Node> queue = new LinkedList<Node>();
		queue.offer(root);
		if(null == root) {
			root = createNode(info);
			return;
		}
		while(!queue.isEmpty()) {
			Node node = queue.poll();
			if(node.left == null) {
				node.left = createNode(info);
				return;
			} else if(node.right == null) {
				node.right = createNode(info);
				return;
			} 
			if(node.left != null) {
				queue.offer(node.left);
			} 
			if(node.right != null) {
				queue.offer(node.right);
			}			
		}
	}

	public Node createNode(int number) {
		return new Node(number);
	}
}