package introduction;

class BinaryAddition{
	public static String printArr(int[] arr) {
		String str = "";
		for(int i = 0; i < arr.length; i++)
			str+=arr[i];
		return str;
	}
	
	public static boolean isSumPossible(int[] a, int[] b) { //both arrays should have same length and must contain only 1 and 0
		if(a.length != b.length)
			return false;
		boolean flag1,flag2;
		for(int i=0; i < a.length; i++) {
			flag1 = a[i] == 0 || a[i] == 1;
			flag2 = b[i] == 0 || b[i] == 1;
			if(!(flag1 && flag2))
				return false;
		}
			
		return true;	
	}
	
	public static void main(String args[]) {
		int[] a = new int[] {0,1,1,0,1};
		int[] b = new int[] {1,1,1,0,1};
		int[] sum = new int[a.length+1];
		int carry  = 0;
		if(isSumPossible(a,b)) {
			for(int i = a.length-1; i >= 0; i--) {
				sum[i+1] = a[i]^(b[i]^carry);
				carry = (b[i]&carry) | (a[i]&carry) | (b[i]&a[i]);
			}
			sum[0] = carry;
			System.out.println("\n"+printArr(a)+"+"+printArr(b)+"="+printArr(sum));
		}
		else
			System.out.println("Please check input array!");
	}
}
