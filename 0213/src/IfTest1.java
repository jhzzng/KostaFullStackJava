
public class IfTest1 {
	 public static void main(String[] args) {
		 int kor=90, eng=80, math=98;
		 int tot = kor+eng+math;
		 double avg = tot /3.0;
		 
		 char grade;
		 if(avg>=90) {
			 grade="A";
		 }
		 else if (avg>=80) {
			 grade='B';
		 }
		 else if (avg>=70) {
			 grade='C';
		 }
		 else if (avg>=60) {
			 grade='D';
		 }
		 else {
			 grade='F'
		 }
		 System.out.println(String.format(null, args));
	 }
}
