package ex6;

public class Q4 {
	public static void main(String args[]) {
		Student s = new Student();
		// 나는 Student 클래스의 s라는 레퍼런스를 만들거야
		s.name = "홍길동"; // 이름이랑 이것저것 붙일거야
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;
		System.out.println("이름:" + s.name);
		System.out.println("총점:" + s.getTotal());
		System.out.println("평균:" + s.getAverage());
	}
}

//		 이름:홍길동
//		 총점:236
//		 평균:78.7
//		 
//		 1. 메서드명 : getTotal
//		   기    능 : 국어(kor), 영어(eng), 수학(math)의 점수를 모두 더해서 반환한다.
//		   반환타입 : int
//		   매개변수 : 없음
//		2. 메서드명 : getAverage
//		   기    능 : 총점(국어점수+영어점수+수학점수)을 과목수로 나눈 평균을 구한다. 
//		              소수점 둘째자리에서 반올림할 것.
//		   반환타입 : float
//		   매개변수 : 없음