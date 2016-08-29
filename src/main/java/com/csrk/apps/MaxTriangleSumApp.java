package com.csrk.apps;

/**
 * Gives the max sum of all possible paths where a path can traverse only left or right element below.
 *     This program uses the bottom-up approach, the element is replaced by the max sum of elements and 
 *     works its way up and hence in the top element we get the max sum which is displayed as the 
 *     result.
 *
 */
public class MaxTriangleSumApp {

	public static void main(String[] args) throws Exception {

		int[][] triangle = { { 3 }, { 7, 4 }, { 2, 4, 6 }, { 8, 5, 9, 3 } };
//		 MaxTriangleSumApp.printTriangle(triangle);
		for (int row = triangle.length - 1; row > 0; row--)
			for (int column = 0; column < triangle[row].length - 1; column++)
				triangle[row - 1][column] += Math.max(triangle[row][column], triangle[row][column + 1]);

		System.out.println(triangle[0][0]);
//		 MaxTriangleSumApp.printTriangle(triangle);
	}

	/**
	 * This method is just for visualization of the results and is not part of
	 * logic to solve the max path problem. By printing the triangle before and
	 * after we can see how the max value of the triangle is obtained. 
	 * 
	 */
	public static void printTriangle(int[][] triangle) {

		int maxSpacesForFormat = (triangle.length + (triangle.length - 1)) / 2;
		for (int i = 0; i < triangle.length; i++) {
			int numOfSpaces = maxSpacesForFormat - i;
			if (numOfSpaces > 0)
				System.out.print(String.format("%" + numOfSpaces + "s", ""));

			for (int j = 0; j < triangle[i].length; j++) {

				System.out.print(triangle[i][j] + " ");
			}
			System.out.println();
		}
	}
}