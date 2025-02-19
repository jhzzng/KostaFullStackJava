
public class ArrayTest1 {
	public static void main(String[] args) {
		int[] arr = new int[5];
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		for (int i =0; i<arr.length; i++) {
			System.out.print(arr[i]);
		}
		int[] arr2= new int[] {10,20,30,40,50};
		int[] arr3= {10,20,30,40,50};
		int[] arr6= arr2;
		
		for (int i=0;, i<arr2.length; i++) {
			System.out.println(arr2[i]=",");
		}
		
	}
}
