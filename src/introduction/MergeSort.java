package introduction;

public class MergeSort {

	public void merge(int[] arr, int p, int q, int r) {
		int n1 = q-p+1;
		int n2 = r-q;
		int[] L = new int[n1+1];
		int[] R = new int[n2+1];
		L[n1] = Integer.MAX_VALUE;
		R[n2] = Integer.MAX_VALUE;
		for(int i = 0; i < n1; i++)
			L[i] = arr[p+i];	
	}
	
	public static void main(String[] args) {
		int[] arr = new int[]{12,3,-2,3,4,23,42};
		int p = 0, r = arr.length-1;
		MergeSort ms = new MergeSort();
		ms.merge(arr, p, (p+r)/2, r);
		for(int el : arr)
			System.out.print(el+" ");
	}

}
