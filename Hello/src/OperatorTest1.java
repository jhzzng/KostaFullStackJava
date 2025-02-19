
public class OperatorTest1 {

	public static void main(String[] args) {
		int n = 10;
		int m = n++;
		System.out.println(n);
		System.out.println(m);
		
		byte a = 10;
		byte b = (byte)(a+10);
		int k = 1000000;
		int v = 1000000;
		long h = (long)k*v;
		System.out.println(h);
		
		long z = 1000000*1000000l;
		System.out.println(z);
		
		long c = 1000000/1000000*1000000;
		System.out.println(c);
		
		char c1 = 'a';
		int c2 = c1+1;
		System.out.println(c2);
		
		char c3 = ++c1;
		System.out.println(c3);
		
		int i = 1-0;
		System.out.println(i);
	}
}