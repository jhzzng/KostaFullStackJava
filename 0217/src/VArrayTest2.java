import java.util.Scanner;

public class VArrayTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("반 수를 입력하세요 : ");
		int cnt = sc.nextInt();
		int [][] score = new int [cnt][];
		for(int i = 0; i<score.length; i++) {
			System.out.println((i+1)+ "반의 학생 수를 입력하세요 : ");
			score[i]= new int [sc.nextInt()];
		}
		for (int i=0; i<score.length; i++) {
			for (int j=0; j<score[i].length; j++) {
				System.out.println(String.format("%d반 ,%d번 학생 점수 입력", i+1,j+1));
				score[i][j] = sc.nextInt();
			}	
			
		}
		for(int i = 0 ; i<score.length; i++) {
			for(int j=0; j<score[i].length; j++) {
				System.out.print(String.format("%2d ", score[i][j]));
			}
			System.out.println();
		}
		for(int i = 0; i<score.length; i++) {
			for(int j=0; j<score[i].length; j++) {
				sum += score[i][j];
				System.out.print(String.format("%2d ", sum));
			}
		}
	}
}
