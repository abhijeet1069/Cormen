package cormen.introduction;

/*Find smallest element of A*/
public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = new int[]{12,344,234,23,45,56,78,89,676,45,34,5,656,67,1};
		for(int i = 0; i < arr.length-1; i++){
			int minIndex = i;
			/*loop to find min element index*/
			for(int j = i+1; j < arr.length; j++){
				if(arr[minIndex] > arr[j])
					minIndex = j;
			}
			int temp = arr[minIndex]; /*swap*/
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
		for(int el : arr)
			System.out.print(el+" ");
		System.out.println();
	}
}
