package suryaseljava.javaintprograms;

import java.util.Scanner;

public class DigitinString_sum {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// Program To Find The DigitinString and Sum Of The Numbers?
		
		
		Scanner s = new Scanner(System.in);
		 System.out.println("Enter String: ");
		 String St = s.nextLine();
		 
		 int sum = 0;
		 for(int i = 0; i < St.length(); i++)
		 { 
		 if(Character.isDigit(St.charAt(i))) 
		 {
		 sum = sum + Integer.parseInt(St.charAt(i)+"");
		 } 
		 }
		 System.out.println("Sum Of Numbers In The String :- "+sum); 
		 
		 }
		 
	}


