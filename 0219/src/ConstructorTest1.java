class Person {
	int age;
	String name;
	
	Person(){
		this(1,"none");
	}
	Person(int age){
		this(age,"none");
	}
	Person(String name){
		this(1,name);
		}
	Person(int age, String name){
		this.age = age;
		this.name = name;
	}
	void info() {
		System.out.println(String.format("이름 : %s ,나이 : %d",this.name, this.age));
	}
	
}
public class ConstructorTest1 {
	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person(10);
		Person p3 = new Person("hong");
		Person p4 = new Person(20, "park");
		
		p1.info();
		p2.info();
		p3.info();
		p4.info();
	
	}

}
