package product.hunt.practise.dsa.arrays;

public class NumIdenticalPairs {
	public static void main(String[] args) {
		numIdenticalPairs(new int[] { 1, 1, 1, 1 });
	}

	public static int numIdenticalPairs(int[] nums) {
		int i = 0;
		int j = nums.length - 1;
		int pair = 0;
		while (i < j) {
			if (nums[i] == nums[j]) {
				pair++;
				if(j==i+1) 
				{
					i++;
					j = nums.length - 1;	
				}
				else 
				{
					j--;
				}
			} else if (j == i + 1) {
				i++;
				j = nums.length - 1;
			} else {
				j--;
			}

		}
		System.out.println(pair);
		return pair;

	}

}
