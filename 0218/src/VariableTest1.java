class Variables {
	int iv;
	static int sv;
	void method() {
		int lv = 30;
		System.out.println(lv);
	}
}
public class VariableTest1 {
	public static void main(String[] args) {
		Variables.sv = 10;
		Variables v1 = new Variables();
		System.out.println(v1.sv);
		Variables v2 = new Variables();
		System.out.println(v2.sv);
//		v.iv = 20;
//		v.method();
	}

}
