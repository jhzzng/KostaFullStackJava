class Car{
	int door = 4;
	Car(){
		door = 6;
		System.out.println("생성자"+door);
	}
	{
		door = 5;
		System.out.println("초기화블럭"+door);
	}
}
class Card {
	static int width = 30;
	static {
		width = 50;
	}
}
class Rand {
	static int[] nums = new int [10];
	static {
		for(int i=0; i<nums.length; i++) {
			nums[i] = (int)(Math.random()*100)+1;
		}
	}
}
public class VariableInitTest {
	public static void main(String[] args) {
		Car car = new Car();
		System.out.println(car.door);
		for(int i = 0; i<Rand.nums.length; i++) {
			System.out.print(Rand.nums[i]+",");
		}
	}

}
