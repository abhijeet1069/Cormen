package introduction;

public class MergeSort {

	public void merge(int[] arr, int p, int q, int r) {
		int n1 = q-p+1;
		int n2 = r-q;
		int[] L = new int[n1+1];
		int[] R = new int[n2+1];
		for(int i = 0; i < n1; i++)
			L[i] = arr[p+i];
		for(int j = 0; j < n2; j++)
			R[j] = arr[q+j+1];	
		L[n1] = Integer.MAX_VALUE;
		R[n2] = Integer.MAX_VALUE;
		int i = 0, j = 0;
		for(int k = p; k <= r; k++){
			if(L[i] <= R[j]){
				arr[k] = L[i];
				i += 1;
			}
			else{
				arr[k] = R[j];
				j += 1;
			}
		}
	}

	public void mergeSort(int[] arr, int p, int r){
		if(p < r){
			int q = (p+r)/2;
			mergeSort(arr,p,q);
			mergeSort(arr,q+1,r);
			merge(arr,p,q,r);
		}
		
	}
	
	public static void main(String[] args) {
		int[] arr = new int[]{12,3,-2,3,4,23,42};
		int p = 0, r = arr.length-1;
		MergeSort ms = new MergeSort();
		ms.mergeSort(arr,p,r);
		for(int el : arr)
			System.out.print(el+" ");
	}

}
