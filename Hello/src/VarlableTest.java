
public class VarlableTest {

	public static void main(String[] args) {
		//이름
		String name = "이주현";
		System.out.println(name);
		//나이
		int age;
		age = 26;
		System.out.println(age);
		//키
		float height;
		height = 178.3f;
		System.out.println(height);
		
		System.out.println("이름 : "+name +", 나이 : "+age +", 키 : "+ height);
		System.out.println(String.format("이름:%s, 나이:%d, 키:%.1f", name,age,height));
	}
}
//출력
//이름:홍길동, 나이:40, 키:178.3