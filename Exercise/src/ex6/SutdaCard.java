package ex6;

public class SutdaCard {
	int num;
	boolean isKwang;
	
	SutdaCard() {
		this(1,true);
	}
	SutdaCard(int num, boolean isKwang){
		this.num = num;
		this.isKwang = isKwang;
	}
	
	String info() {
		return num + (isKwang?"K":"");
	}
}
//다음과 같은 멤버변수를 갖는 SutdaCard클래스를 정의하시오
