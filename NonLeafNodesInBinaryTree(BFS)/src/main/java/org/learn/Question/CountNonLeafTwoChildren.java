
package org.learn.Question;

import java.util.LinkedList;
import java.util.Queue;

import org.learn.PrepareTree.Node;

public class CountNonLeafTwoChildren {
	public static int countNonLeafTwoChildren(Node root) {
		if (root == null) {
			System.out.println("Tree is empty");
			return -1;
		}
		int nNonLeaves = 0;
		Queue<Node> queue = new LinkedList<Node>();
		queue.offer(root);

		while (!queue.isEmpty()) {
			Node node = queue.poll();
			
			if(node.left != null && node.right != null)	 {
				nNonLeaves++;				
			}			
			if (node.left != null) {
				queue.offer(node.left);
			}
			if (node.right != null) {
				queue.offer(node.right);
			}
		}
		System.out.println("Non Leaf nodes having two children in Binary Tree is : " + nNonLeaves);
		return nNonLeaves;
	}
}
