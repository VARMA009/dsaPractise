package product.hunt.practise.dsa.arrays;

import java.util.Arrays;

public class RangeSum {
	public static long[] rangeSum(int[] A, int[][] B) {
		// find the prefix sum array
		// iterate based on the elements present in based
		int[] prefixSumArray = new int[A.length];
		prefixSumArray[0] = A[0];
		for (int n = 1; n < A.length; n++) {
			prefixSumArray[n] = prefixSumArray[n - 1] + A[n];
		}
		long[] output = new long[B.length];
		for (int n = 0; n < B.length; n++) {
			int L = B[n][0];
			int R = B[n][1];
			if (R == L) {
				output[n] = prefixSumArray[R];
			} else {
				if (L == 0) {
					output[n] = prefixSumArray[R];
				} else {
					output[n] = prefixSumArray[R] - prefixSumArray[L - 1];
				}

			}
		}
		System.out.println(Arrays.toString(prefixSumArray));
		System.out.println(Arrays.toString(output));

		return output;
	}

	public static void main(String[] args) {
		int[] A = { 45987, 31653, 86838, 41659, 817, 19032, 42913, 85283, 11180, 47928, 85302, 47621, 76705, 67093,
				67163, 74353, 82250, 73584, 19692, 77514, 93476, 19363, 91291, 42045, 46078, 76910, 77810, 67263, 87213,
				75039, 19380, 9699, 41372, 60317, 33153, 9492, 93569, 77617, 5880, 16213, 55851, 30386, 45687, 87411,
				22935, 51404, 49821, 47683, 91554, 86476, 64209, 19453, 71577, 56714, 28540, 21845, 56876, 51315,
				96016 };
		int[][] B = { { 35, 36 }, { 36, 46 }, { 27, 48 }, { 5, 35 }, { 6, 25 }, { 20, 23 }, { 24, 53 }, { 21, 41 },
				{ 39, 44 }, { 8, 8 }, { 23, 49 }, { 17, 56 }, { 28, 56 }, { 54, 54 }, { 1, 19 }, { 39, 52 }, { 22, 23 },
				{ 29, 37 }, { 11, 27 }, { 22, 22 }, { 7, 15 }, { 1, 8 }, { 45, 51 }, { 30, 44 }, { 3, 58 }, { 7, 16 },
				{ 21, 54 }, { 17, 44 }, { 1, 24 }, { 4, 38 }, { 0, 21 }, { 27, 50 }, { 36, 52 }, { 14, 20 }, { 10, 10 },
				{ 18, 55 }, { 40, 42 }, { 10, 52 }, { 16, 21 }, { 9, 36 }, { 18, 42 }, { 10, 32 } };
		rangeSum(A, B);
	}

}
