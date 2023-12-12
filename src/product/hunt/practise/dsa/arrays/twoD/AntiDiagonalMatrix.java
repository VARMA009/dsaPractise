package product.hunt.practise.dsa.arrays.twoD;

public class AntiDiagonalMatrix {

	public static void printAntiDiagonal(int[][] twoDArray) {
		int rowLen = twoDArray.length;
		for (int i = 0; i < rowLen; i++) {
			System.out.println(twoDArray[i][rowLen - 1 - i]);
		}
	}

	public static void main(String[] args) {
		int[][] twoDArray = { { 1, 2, 3, 4 }, { 0, 1, 2, 3 }, { 2, 3, 1, 0 }, { 2, 3, 1, 0 } };
		printAntiDiagonal(twoDArray);
	}

}
