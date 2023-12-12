package product.hunt.practise.dsa.arrays;

public class Rotatektimesr2l {
	
	static void reverseArray(int[] A, int k) 
	{
		k=k%A.length;
		for(int i=0;i<k;i++) 
		{
			int temp=A[A.length-1];
			for(int j=A.length-1;j>=1;j--) 
			{
				A[j]=A[j-1];
			}
			A[0]=temp;
		}
		System.out.println(java.util.Arrays.toString(A));
	}
	
	public static void main(String[] args) {
		int[] A= {1,2,3,4,5};
		int k=1;
		reverseArray(A,k);
	}

}
