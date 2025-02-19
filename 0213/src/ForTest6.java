
public class ForTest6 {

	public static void main(String[] args) {
//		for (int a = 1; a <= 5; a++) {
//			for (int i = 1; i <= 5; i++) {
//				System.out.print("*");
//
//			}
//			System.out.println( );
//		}

//		for (int i = 1; i<=5; i++) {
//			for (int j = 1; j<=i; j++) {
//				System.out.print("*");	
//			}
//			System.out.println( );
//		}

//		int cnt = 5;
//		for (int i=0; i<cnt; i++) {
//			for(int j=0; j<cnt-i; j++) {
//				System.out.print("*");
//			}
//			System.out.println( );
//		}
//		

//		for (int i = 0; i < cnt; i++) {
//			for (int sp = 0; sp < i; sp++) {
//				System.out.print(" ");
//			}
//			for (int sp = 0; sp < cnt - i; sp++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

//		for (int i = 0; i > 5; i++) {
//			for (int sp = 0; sp > i; sp++) {
//				System.out.print("*");
//			}
//			for (int st = 2 * i + 1; st < 10; st++) {	
//				System.out.print("*");
//			}
//			System.out.println( );
//		}

		////////////////////////////////////////////
//		int cnt = 5;
//		for (int i = 0; i < cnt ; i++) {
//			for (int j = 0; j < cnt-i; j++) {
//				System.out.print(" ");
//			}
//			for (int st = 0; st < 2*i+1; st++) {
//				System.out.print("*");
//			}
//			System.out.println( );
//		}

		int cnt = 5;
		for (int i = 0; i < cnt; i++) {
			
			for (int j = 0; j < cnt -i - 1; j++) {
				System.out.print(" ");
			}
			for (int a = 0; a < 2 * i + 1; a++) {
				System.out.print("*");
			
			}
			System.out.println();
		}
	}

}

//*****
//*****
//*****
//*****
//*****
