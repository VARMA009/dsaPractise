package product.hunt.practise.dsa;

public class PerfectDivision {
	public static int solve(int A) {
		int count = 0;
		int i = 1;
		while (i < A) {
			if (A % i == 0) {
				count = count + i;
				
			}
			i++;
		}
		if (count == A) {
			return 1;
		} else {
			return 0;
		}
	}

	public static void main(String[] args) {
		System.out.println(solve(6));
	}

}
