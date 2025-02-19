
public class OperatorTest2 {

	public static void main(String[] args) {
		float pi=3.141592f;
//		pi = (int)(pi*1000f)/1000f;
//		System.out.println(pi);
		
		pi = Math.round(pi*1000f)/1000f;
		System.out.println(pi);
	}
}
