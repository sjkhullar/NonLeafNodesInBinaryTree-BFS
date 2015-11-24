package org.learn.Client;

import org.learn.PrepareTree.Node;
import org.learn.PrepareTree.Tree;
import org.learn.Question.CountNonLeafNodes;
import org.learn.Question.CountNonLeafOneChild;
import org.learn.Question.CountNonLeafTwoChildren;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
    {		
		int[] data = {50, 150, 25, 80, 125, 160, 10, 30, 60, 90, 110};
    	Tree tree = new Tree();
    	Node root = tree.createNode(100);
    	for(int i : data ) {
    		tree.insert(root, i );
    	} 
    	//Class to count leaf nodes in binary tree
    	//Node have one child only
    	CountNonLeafOneChild.countNonLeafOneChild(root);    
    	//Class to count leaf nodes in binary tree
    	// having two children (both left and right child are valid)
    	CountNonLeafTwoChildren.countNonLeafTwoChildren(root); 
    	//Class to count leaf nodes in binary tree
    	// 1.) having one child node only ..Eithe left or right child
    	// 2.) having two children (both left and right child are valid)
    	//effectively combination of above two cases
    	CountNonLeafNodes.countNonLeafNodes(root); 
    }
}
