
public class Employee {
	final static int YEAR = 2015;
	static int empNum = 2015;
	String num;
	String name;
	int pay;
	
	public Employee(String name, int pay) {
		num += ""+YEAR+empNum++;
	}

	Employee(String num, String name, int pay) {
		this.num = num;
		this.name = name;
		this.pay = pay;
	}

	String info() {

		return String.format("사번 : %s, 이름 : %s, 급여 : %d", num, name, pay);

	}

	void setPay(int tpay) {
		pay = tpay;
		}
	void setBonus(int money) {
		pay += money;
	}
}

