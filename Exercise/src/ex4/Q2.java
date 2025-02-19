package ex4;
// 1부터 20까지의 정수 중에서 2 또는 3의 배수가 아닌 수의 총합을 구하시오
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int i, b=0;
//		for (i=0; i<=20; i++) {
//			if(i%2==0)
//			continue;
//			if(i%3==0)
//			continue;
//			b += i ;
//			System.out.println(b);
//		}
		
		int i, b=0;
		for (i=0; i<=20; i++) {
			if(i%2==0)
			continue;
			if(i%3==0)
			continue;
			b += i ;
		}
		System.out.println(b);

	}

}
