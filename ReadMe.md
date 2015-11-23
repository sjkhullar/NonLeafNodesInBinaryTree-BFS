What is non leaf node in binary tree?

A node in a binary tree which have child node(s) is called non leaf node. 

	Non Leaf Node can be Node having one child or both children:
	One child (Either left child or right child)
	Two child (Both left child and right child)

	To find out the non leaf nodes in binary tree, we need to at-least traverse the whole binary tree, to calculate the number of non leaf nodes. Binary Tree traversal is broadly categorized into following category 
	
	1.) Depth First Traversal 
			Pre Order Traversal
			Post Order Traversal
			In Order Traversal
	2) Breadth First Traversal or Level Order Traversal.

	As an example, consider the tree:
	
					   100   ------Level 0
					  /  \
					50    150 -----Level 1
					/ \    \
				   25  80  160 ---Level 2
							 

	As shown in Binary Tree, what 3 non leaf nodes.

	We can go through the complete code. We have created 3 packages
	1.) org.learn.PrepareTree : Under this package we are creating the tree (This tree we will Traverse to find out number of non leaf nodes in binary tree).
	2.) org.learn.Question: Under this question package, we will have CountNonLeafNodes class which is responsible for traversing the tree using level order traversal, to calculate the number of non leaf node in binary tree,
	3.) org.learn.Client: Under this package we have main function, where we are constructing the tree and then we are traversing the whole tree using level order traversal.