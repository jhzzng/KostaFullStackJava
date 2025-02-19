
public class ContinueTest1 {
	public static void main(String[] args) {
		int i,j,cnt;
		j = 0;
		for(i=0; i<=100; i++) {
			if(i%3==0)
				continue;
			if(i%7==0)
				continue;
			j += i;
			System.out.println(j);
		}
	}
}
