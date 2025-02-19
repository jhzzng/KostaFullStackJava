package ex6;

class PlayingCard {
	int kind;
	int num;
	static int width;
	static int height;

	PlayingCard(int k, int n) {
		kind = k;
		num = n;
	}

	public static void main(String args[]) {
		PlayingCard card = new PlayingCard(1, 1);
	}
}

// width, height 지역변수;
// 인스턴스 변수 : kind num
// 지역변수 : card args k n 

