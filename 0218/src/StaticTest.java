class Test {
	int iv;
	static int sv;
	
	void method() {// instance method 에서는 static 변수, instance 변수 모두 사용할 수 있다.
		iv = 10;
		sv = 100;
		method2();
	}
	void method2() {}
	
	static void smethod() { // static method 에서는 instance변수, instance method 사용할 수 없다.
//		iv =20;
		sv = 200;
//		method2();
		smethod2();
	}
	static void smethod2() {}
	}
public class StaticTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test.sv = 5;
		Test.smethod();
		
		Test t = new Test();
		t.iv = 7;
		t.method();

	}

}
