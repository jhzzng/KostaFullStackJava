package ex6;

public class Q20 {

	static int[] shuffle(int []arr) {

		int[] res = new int[arr.length];
		System.arraycopy(arr, 0, res, 0, arr.length);
		int t = 0;
		int tmp = 0;
		for(int a = 0; a<20; a++) {
			int b = (int)(Math.random()*arr.length);
			
			tmp = arr[b];
			arr[b] = arr[t];
			arr[t] = tmp;
		

		}
		
		return res;
	}
	public static void main(String[] args) {
		int[] original = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println(java.util.Arrays.toString(original));
		int[] result = shuffle(original);
		System.out.println("After shuffle");
		System.out.println(java.util.Arrays.toString(original));
		System.out.println(java.util.Arrays.toString(result));
	}

}
