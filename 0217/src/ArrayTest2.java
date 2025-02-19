
public class ArrayTest2 {
	public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " "); // 배열의 각 요소를 출력
        }
        System.out.println(); // 줄바꿈
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr1 = new int [] {1,2,3,4,5};
		int [] arr2 = new int [arr1.length];
		
		//복사 (deep copy)
		for (int i = 0; i<arr1.length; i++) {
			arr2[i] = arr1[i];
		}
		int[] arr3 = new int [arr1.length];
		System.arraycopy(arr1, 0, arr3, 0, arr1.length);
		int[] arr4 = new int [2];
		System.arraycopy(arr1, 1, arr4, 0, 2);
		System.out.println(String.format ("%d", arr4[1]));
		
		int[] arr5 = arr1.clone();
		
		arr2[0] = 10;
		arr3[0] = 20;
		arr5[0] = 30;
		
		printArray(arr1);
		printArray(arr2);
		printArray(arr3);
		printArray(arr5);
		
		
		
	}

}
