class Person {
	int age;
	String name;
	
	Person(){ // 기본 생성자 (Default constructor)
		System.out.println("Person constructor");
	}
	
	Person(int tage, String tname){
		age = tage;
		name = tname;
	}
}
public class ConstructorTest1 {
	public static void main(String[] args) {
		Person p = new Person();
		// new 연산자가 하는 3가지 일
		// 1.클래스의 인스턴스 생성
		// 2.생성자 호출
		// 3.생성한 인스턴스를 클래스 타입으로 변환하여 주소 반환
		
		Person p2 = new Person(20,"홍길동");
	}
}
