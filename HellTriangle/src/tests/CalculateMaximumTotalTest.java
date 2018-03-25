package tests;

import org.junit.Assert;
import org.junit.Test;

import data.TreeNode;
import exception.InvalidInputException;
import exception.NullTriangleException;

/**
 * Test case for calculate maximum method
 * @author Leonardo
 *
 */
public class CalculateMaximumTotalTest {

	@Test
	public void testBasicCalculateMaximumTotal() {
		int[][] triangule = {{6},{3,5},{9,7,1},{4,6,8,4}};

		TreeNode treeNode = null;
		int sum = 0 ;
		try {
			
			treeNode = new TreeNode(triangule);
			sum = treeNode.calculateMaximumTotal();
			
		} catch (InvalidInputException | NullTriangleException e) {
			System.out.println(e.getMessage());
		}

		Assert.assertEquals(26, sum);
	}
	
	@Test
	public void testDepthCalculateMaximumTotal() {
		int[][] triangule = {{6},{3,5},{9,7,1},{4,6,8,4},{10,3,99,40,50,60,45,30},{1000,2,88,540,30,22,65,300,232,600}};

		TreeNode treeNode = null;
		int sum = 0 ;
		try {
			
			treeNode = new TreeNode(triangule);
			sum = treeNode.calculateMaximumTotal();
			
		} catch (InvalidInputException | NullTriangleException e) {
			System.out.println(e.getMessage());
		}

		Assert.assertEquals(1032, sum);
	}

	@Test
	public void testWrongCalculateMaximumTotal() {
		int[][] triangule = {{6},{3,5},{9,7,1},{4,6,8,4}};

		TreeNode treeNode = null;
		int sum = 0 ;
		try {
			
			treeNode = new TreeNode(triangule);
			sum = treeNode.calculateMaximumTotal();
			
		} catch (InvalidInputException | NullTriangleException e) {
			System.out.println(e.getMessage());
		}

		Assert.assertNotEquals(25, sum);
	}
	
}
