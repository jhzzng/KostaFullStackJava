class Time {
	int hour;
	int minute;
	int second;
}
public class ClassArray1 {
	public static void main(String[] args) {
		Time t1 = new Time();
		t1.hour=9;
		t1.minute=50;
		t1.second=30;
		
		Time[] times = new Time [3];
		times[0] = new Time();
		times[0].hour = 9;
		times[0].minute = 52;
		times[0].second = 20;
	}

}
