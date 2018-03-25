/**
 * 
 */
package tests;

import org.junit.Assert;
import org.junit.Test;

import data.TreeNode;
import exception.InvalidInputException;

/**
 * Test case for build tree node method
 * @author Leonardo
 *
 */
public class BuildTreeTest {

	/**
	 * Test method for {@link data.TreeNode#TreeNode(int[][])}.
	 */
	@Test
	public void testTreeNode() {
		int[][] triangule = {{6},{3,5},{9,7,1},{4,6,8,4}};
		
		TreeNode treeNode = null;
		try {
			treeNode = new TreeNode(triangule);
		} catch (InvalidInputException e) {
			System.out.println(e.getMessage());
		}
		
		Assert.assertNotNull(treeNode);
		Assert.assertEquals(6, treeNode.getRoot().getValue());
	}

	@Test
	public void testNullTreeNode() {
		int[][] triangule = null;
		
		TreeNode treeNode = null;
		try {
			treeNode = new TreeNode(triangule);
		} catch (InvalidInputException e) {
			System.out.println(e.getMessage());
		}

		Assert.assertNull(treeNode);
	}
	
}
