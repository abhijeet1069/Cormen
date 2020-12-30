package cormen.introduction;

public class InsertionSort {
	public static void main(String[] args) {
		int[] arr = new int[] {12,34,56,34,1,34,56,7,56,34,234,67,8,9,6,5};
		for(int i = 1; i < arr.length; i++) {
			int key = arr[i];
			int j;
			for(j = i-1; j >= 0 && key < arr[j] ; j--) 
				arr[j+1] = arr[j]; //shift elements towards key
			
			arr[j+1] = key; //not arr[j]
		}
		
		for(int i = 0; i < arr.length; i++)
			System.out.print(arr[i]+" ");
	}
}