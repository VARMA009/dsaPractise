package product.hunt.practise.dsa.arrays.twoD;

import java.util.Arrays;

public class DiagonalPrintRtoL {

	public static void printLTORDiagonal(int[][] input) {
		int rowLen = input.length;
		int colLen = input[0].length;
		int[][] output = new int[rowLen + colLen - 1][colLen];
		int row = 0;
		int col = 0;
		for (int icol = 0; icol < colLen; icol++) {
			int j = icol;
			col = 0;
			for (int i = 0; i < rowLen & j >= 0; i++) {
				output[row][col] = input[i][j];
				j--;
				col++;
			}
			row++;
		}
		for (int irow = 1; irow < rowLen; irow++) {
			int i = irow;
			col = 0;
			for (int j = colLen - 1; j >= 0 & i < rowLen; j--) {
				output[row][col] = input[i][j];
				i++;
				col++;
			}
			row++;
		}
		Arrays.stream(output).forEach(eachRow -> {
			Arrays.stream(eachRow).forEach(element -> System.out.print(element + " "));
			System.out.println(); // Move to the next line for the next row
		});
	}

	public static void main(String[] args) {
		int[][] input = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		printLTORDiagonal(input);
	}

}
