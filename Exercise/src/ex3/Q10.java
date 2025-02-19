package ex3;

public class Q10 {
	 public static void main(String[] args) {
		 char ch = 'A';
//		 char lowerCase = ( ch < 96 ) ? (char)( ch + 32 ) : ch;
		 char lowerCase = ( ch >= 'A'&& ch<='Z' ) ? (char)( ch + 'a'-'A' ) : ch;
		 System.out.println("upperCase:"+ch);
		 System.out.println("lowerCase:"+lowerCase);
}
}

//upperCase:A
//lowerCase:a