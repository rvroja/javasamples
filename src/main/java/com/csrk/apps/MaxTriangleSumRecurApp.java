package com.csrk.apps;

/**
 * Gives the max sum of all possible paths where a path can traverse only left or right element below.
 *     This program uses recursion where the problem is split into sub-problem and base case of the 
 *     recursion is the sum of the base triangle that can be formed with three numbers.
 *
 */
public class MaxTriangleSumRecurApp {

	public int[][] triangle = {{3},{7,4},{2,4,6},{8,5,9,3}};
	
	public static void main(String[] args) {
		
		MaxTriangleSumRecurApp app = new MaxTriangleSumRecurApp();
		System.out.println(app.maxSum(0, 0));
	}
	
	public int maxSum(int row, int col){
		if(row==triangle.length-1){
			return triangle[row][col];
		}
		return Math.max(triangle[row][col]+maxSum(row+1, col), triangle[row][col]+maxSum(row+1, col+1));
	}
}