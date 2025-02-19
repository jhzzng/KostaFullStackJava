class TV {
	String color;
	boolean power;
	int channel;

	void power() {
		power = !power;
	}

	void channelUp() {
		channel++;
	}

	void channelDown() {
		channel--;
	}

	void state() {
		System.out.println(String.format("power:%s, channel:%d", power? "on" : "off", channel));
	}
}

public class ClassTest2 {

	public static void main(String[] args) {

		TV tv = new TV();
		tv.power();
		tv.channel = 11;
		tv.channelUp();
		tv.state();
		
//		tv.channelDown();
//		tv.power();
//		tv.state();
		
		
		TV tv2 = tv;
		tv2.state();
		
		tv.state();
		tv2.state();
	}
}
