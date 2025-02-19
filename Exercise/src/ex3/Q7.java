package ex3;

public class Q7 {
	 public static void main(String[] args) {
		 int fahrenheit = 98;
		 float celcius = (float)5/9*(fahrenheit - 32);
		 System.out.println("Fahrenheit: "+fahrenheit);
		 System.out.println("Celcius: "+ Math.round(celcius*100)/100f);
		 System.out.println("Celcius: "+ (int)(celcius*100 + 0.5)/100f);
		 
		 }
		 }

// Fahrenheit:100
// Celcius:37.78
// 'C = 5/9 × (F - 32)'
