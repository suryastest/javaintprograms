package suryaseljava.javaintprograms;
import java.util.Scanner;

public class callcustomException {

	@SuppressWarnings("resource")
	
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		 System.out.println("Enter age: ");
		 int age = s.nextInt();
		 
		 try
		 {
		 if(age < 18)
		 {
		 throw new customException();
		 }
		 }
		 catch(customException e)
		 
		 {
			 System.out.println(e.getFaultMessage());
		 }
		 finally {
			 System.out.println("finally");
			 }
		 
		 
	}

}
