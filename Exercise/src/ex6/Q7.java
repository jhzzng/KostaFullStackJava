package ex6;

public class Q7 {
	public static void main(String args[]) {
		 MyPoint p = new MyPoint(1,1);
		        // p(1,1)과 (2,2)의 거리를 구한다.
		 System.out.println(p.getDistance(2,2)); 

		 MyPoint p2 = new MyPoint(2,2);
		 System.out.println(p.getDistance(p2));
		}
}
