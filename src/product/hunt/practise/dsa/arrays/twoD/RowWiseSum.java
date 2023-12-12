package product.hunt.practise.dsa.arrays.twoD;

public class RowWiseSum {

	public static void rowSum(int[][] array) {
		int rowLen = array.length;
		int colLen = array[0].length;

		for (int i = 0; i < rowLen; i++) {
			int sum = 0;
			for (int j = 0; j < colLen; j++) {
				sum += array[i][j];

			}
			System.out.println(sum);
		}
	}

	public static void main(String[] args) {
		int[][] twoDArray = { { 1, 2, 3, 4, 7, 9 }, { 0, 1, 2, 3, 7, 9 }, { 2, 3, 1, 0, 7, 9 }, { 2, 3, 1, 0, 7, 9 } };
		rowSum(twoDArray);
	}

}
