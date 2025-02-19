
public class ForTest3 {

	public static void main(String[] args) {
		int tot = 0;
		int even = 0;
		for (int a = 1; a <=100; a +=1) {
			tot += a;
		}
		for (int i = 3; i <= 100; i += 3) {
			even += i;
		}
		System.out.println(tot-even);
	}

}
