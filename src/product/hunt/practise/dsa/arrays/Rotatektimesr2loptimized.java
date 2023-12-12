package product.hunt.practise.dsa.arrays;

public class Rotatektimesr2loptimized {
	
	public static int[] solve(int[] A, int B) {
        B=B%A.length;
        reverse(A,0,A.length-1);
        reverse(A,0,B-1);
        reverse(A,B,A.length-1);
		System.out.println(java.util.Arrays.toString(A));
        return A;
    }
    static int[] reverse(int[] A, int start, int end)
    {
        while(start<end)
        {
            int temp=A[start];
            A[start]=A[end];
            A[end]=temp;
            start++;
            end--;
        }
        return A;
    }
	
	public static void main(String[] args) {
		int[] A= {1,2,3,4,5};
		int k=1;
		solve(A,k);
	}

}
