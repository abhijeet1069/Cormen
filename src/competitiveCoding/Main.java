package competitiveCoding;

import java.util.Scanner;

public class Main {

	public static int numOfDig(int num) {
		return (int) (Math.log10(num)+1);
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int test = in.nextInt();
		int[] arr = new int[] {1,3,6,10};
		while(test > 0) {
			int num = in.nextInt();
			int row = num%10;
			int col = numOfDig(num);
			int sum = (row-1)*10 + arr[col-1];
			System.out.println(sum);
			test--;
		}
		in.close();
	}
}
