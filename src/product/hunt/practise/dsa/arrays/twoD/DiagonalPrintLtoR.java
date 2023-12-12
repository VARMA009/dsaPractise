package product.hunt.practise.dsa.arrays.twoD;

import java.util.Arrays;

public class DiagonalPrintLtoR {

	public static void printLTORDiagonal(int[][] input) {
		int rowsLen = input.length;
		int colLen = input[0].length;

		// Start index would be N-1,0
		// Once the start is found the next diagonal will be at i+1,j+1
		// Should go the next diagonal till i<N & j<M
		// Decrement rows from N-1 to 0 and then increment the columns till 1,M-1
		int[][] output = new int[rowsLen + colLen - 1][colLen];
		int row = 0;
		int col = 0;
		//(N-1,0) run 
		for (int i = rowsLen - 1; i >= 0; i--) {
			col = 0;
			// Start the diagonal chain
			int j = 0;
			for (int irow = i; irow < rowsLen & j < colLen; irow++) {
				output[row][col] = input[irow][j];
				j++;
				col++;
			}
			row++;
		}
		
		for (int icol = 1; icol < colLen; icol++) {
			col = 0;
			int j = icol;
			// Start the diagonal chain
			for (int i = 0; i < rowsLen & j < colLen; i++) {
				output[row][col] = input[i][j];
				j++;
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
		int[][] input = { { 1, 2, 3, 4 }, { 9, 1, 2, 3 }, { 2, 3, 1, 5 }, { 4, 6, 9, 2 } };
		printLTORDiagonal(input);
	}

}
