package product.hunt.practise.dsa.arrays.twoD;

public class ColumnWiseSum {
	// Iterate over the rows for column wise sum
	static void columnSum(int[][] twoDArray) {
		int rows = twoDArray.length;
		int cols = twoDArray[0].length;

		for (int i = 0; i < cols; i++) {
			int sum = 0;
			for (int j = 0; j < rows; j++) {
				sum += twoDArray[j][i];
			}
			System.out.println("Sum of column " + i + "-" + sum);
		}
	}

	public static void main(String[] args) {
		int[][] twoDArray = { { 1, 2, 3, 4, 7, 9 }, { 0, 1, 2, 3, 7, 9 }, { 2, 3, 1, 0, 7, 9 }, { 2, 3, 1, 0, 7, 9 } };
		columnSum(twoDArray);
	}

}
