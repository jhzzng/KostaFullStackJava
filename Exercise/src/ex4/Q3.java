package ex4;
// 1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10)의 결과를 계산하시오
public class Q3 {
	public static void main(String[] args) {
		int a = 0, j ;
		for (int i=1; i<=10; i++) {
			for(j=1; j<=i; j++) {
				a+=j;
			}
		}
		System.out.println(a);
	}
}
