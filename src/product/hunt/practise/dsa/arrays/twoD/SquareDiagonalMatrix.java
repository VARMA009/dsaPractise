package product.hunt.practise.dsa.arrays.twoD;

public class SquareDiagonalMatrix {

	public static void printDiagonal(int[][] twoDarray) {
		int rowLen = twoDarray.length;
		int colLen = twoDarray[0].length;

		
		//TimeComplexity:O(N^2)
		for (int i = 0; i < rowLen; i++) {
			for (int j = 0; j < colLen; j++) {
				if (i == j) {
					System.out.println(twoDarray[i][j]);
				}
			}
		}
	}
	
	//TimeComplexity:O(N)
	public static void printDiagonalOpt(int[][] twoDarray) {
		int rowLen = twoDarray.length;
		for (int i = 0; i < rowLen; i++) {
			System.out.println(twoDarray[i][i]);
		}
	}

	public static void main(String[] args) {
		int[][] twoDArray = { { 1, 2, 3, 4 }, { 0, 1, 2, 3 }, { 2, 3, 1, 0 }, { 2, 3, 1, 0 } };
		printDiagonal(twoDArray);
		printDiagonalOpt(twoDArray);
	}

}
