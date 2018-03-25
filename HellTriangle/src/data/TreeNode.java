package data;

import exception.InvalidInputException;
import exception.NullTriangleException;

/**
 * @author Leonardo
 *
 */
public class TreeNode {

	private Node root;
	
	public TreeNode(int[][] treeValues) throws InvalidInputException {
		if(treeValues == null) {
			throw new InvalidInputException("The input is null");
		}
		this.root = new Node(treeValues[0][0]);
		this.root.setLeftChild(this.buildTree(treeValues, this.root.getLeftChild(), 1, 0));
		this.root.setRightChild(this.buildTree(treeValues, this.root.getRightChild(), 1, 1));
	}
	
	/**
	 * @return the root
	 */
	public Node getRoot() {
		return root;
	}

	/**
	 * @param root the root to set
	 */
	public void setRoot(Node root) {
		this.root = root;
	}
	
	/**
	 * Calculate the maximum total from a TreeNode structure by recursion
	 * @return
	 * @throws NullTriangleException
	 */
	public int calculateMaximumTotal() throws NullTriangleException {
		
		int sum = 0;
		
		if(this.root == null) {
			throw new NullTriangleException("The triangle structure is empty");
		}
		
		sum = this.root.getValue();
		
		/* 
		 * root without children
		 * return the root's value
		 */
		if(this.root.getLeftChild() == null && this.root.getRightChild() == null) {
			return sum;
		} else {
			sum = Math.max(sum, this.root.getValue() + this.runTreePath(this.root.getLeftChild()));
			sum = Math.max(sum, this.root.getValue() + this.runTreePath(this.root.getRightChild()));
		}
		
		return sum;
	}
	
	/**
	 * Build a tree from a multidimensional array and a started node
	 * @param treeValues
	 * @param node
	 * @param i
	 * @param j
	 * @return
	 */
	private Node buildTree(int[][] treeValues, Node node, int i, int j) {
		if(i < treeValues.length && j < treeValues[i].length) {
			node = new Node(treeValues[i][j]);
			node.setLeftChild(this.buildTree(treeValues, node.getLeftChild(), i + 1, j));
			node.setRightChild(this.buildTree(treeValues, node.getRightChild(), i + 1, j + 1));			
		}
		
		return node;
	}

	/**
	 * Using recursion, go into the tree branches (left and right) until return a leaf 
	 * and then calculate the max between current node branch sum and the amount
	 * @param node
	 * @return
	 */
	private int runTreePath(Node node) {
		int sum = 0;
		
		/* if it's not a leaf */
		if(node != null) {
			sum = Math.max(sum, node.getValue() + this.runTreePath(node.getLeftChild()));
			sum = Math.max(sum, node.getValue() + this.runTreePath(node.getRightChild()));
		}
		
		return sum;
	}
}
