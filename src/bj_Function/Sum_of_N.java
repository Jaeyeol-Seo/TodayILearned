package bj_Function;

//BOJ 15596
public class Sum_of_N {
	
	public static long sum(int[] a) {
		long result = 0;
		
		for ( int i : a) {
			result += i;
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
