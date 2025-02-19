
public class WhileTest1 {
	public static void main(String[] args) {
		int cnt = 5, i, j;
		i=0;
		while (i < cnt) {
			j=0;
			while  (j < cnt - i -1) {
				System.out.print(" ");
				j++;
			}
			j = 0;
			while (j < 2 * i + 1) {
				System.out.print("*");
				j++;
			}
			System.out.println( );
			i++;
		}
		
	}
}
