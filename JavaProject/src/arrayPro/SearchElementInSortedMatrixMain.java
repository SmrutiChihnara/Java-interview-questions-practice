package arrayPro;

public class SearchElementInSortedMatrixMain {

	public static void main(String[] args) {
		int[][] sortedMatrix = { { 1, 6, 10, 12, 20 }, { 4, 8, 15, 22, 25 }, { 5, 20, 35, 37, 40 },
				{ 10, 28, 38, 45, 55 } };

		searchElementInSortedMatrix(sortedMatrix, 37);
	}

	public void getElements(int[][] sortedMatrix)
	{
		for(int i =0;i<sortedMatrix.length;i++)
		{
			for(int j =0;j<sortedMatrix[i].length;j++)
			{
				
			}
		}
	}
	
	
	private static void searchElementInSortedMatrix(int[][] sortedMatrix, int X) {
		int R = sortedMatrix.length;
		int C = sortedMatrix[0].length;
		int r = 0, c = C - 1;

		// We can go either left or down
		// left => decrement in columns, 0 will be the bound
		// down => increment in row, R-1 will be the bound
		while (r <= R - 1 && c >= 0) {
			if (sortedMatrix[r][c] == X) {
				// Found the element
				System.out.println("Element found at r =" + r + " c=" + c);
				return;
			}
			if (X < sortedMatrix[r][c]) {
				// move left
				c = c - 1;
			} else {
				// move down
				r = r + 1;
			}
		}
		System.out.println("Element is not found in sorted matrix");
	}
}