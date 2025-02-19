
public class ArrayExam {
	public static void main(String[] args) {
		char[] hex = {'C', 'A', 'F', 'E'};
		String[] binary = {"0000", "0001", "0010","0011","0100","0101","0110","0111"
				,"1000","1001","1010","1011","1100","1101","1110","1111"
				};
		String result = "";
		for(int i = 0; i<hex.length; i++) {
			if(hex[i]>='0' && hex[i]<='9') {
				result += binary[hex[i]-'0'];
			}
			else if (hex[i]>='A' && hex[i] <='F') {
				result += binary[hex[i]-'A'+10];
			}
			else if (hex[i]>='a' && hex[i]<='f' ) {
				result += binary[hex[i]-'a'+10];
			}
		}
		System.out.println("hex: " + new 
				String(hex));
		System.out.println("binary: " + result);
		//c = 0000
		//0 = 0000
		//1 = 0001
		//2 = 0010
		//3 = 0011
		//4 = 0100
		//5 = 0101
		//6 = 0110
		//7 = 0111
		//8 = 1000
		//9 = 1001
		//10 A = 1010
		//11 B = 1011
		//12 C = 1100
		//13 D = 1101
		//14 E = 1110
		//15 F = 1111
		
		
	}
}

//출력결과 
//1100101011111110