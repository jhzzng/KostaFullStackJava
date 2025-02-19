
public class ForTest5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int n, a=0;
//		for(n=1; n<=9; n++) {
//			a=2*n;
//			System.out.println(String.format("2 x %d =%2d", n,a));
//		}
//		for (int dan=2; dan<10;dan++) {
//			for (int i =1; i <10; i++) {
//				System.out.println();
//			}
//		}
		for (int i = 1; i <= 9; i++) {
			for (int dan = 2; dan <= 9; dan++) {
				System.out.print(String.format("%dx%d=%d\t", dan, i, dan * i));
			}
			System.out.println();
		}
	}
}
