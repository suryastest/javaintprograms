package suryaseljava.javaintprograms;

public class Interger_String {

	public static void main(String[] args) {
		                                 // Program To Find out Integer String Java Program?
		
		
		int a = 1234;
	     int b = -1234;
	     String str1 = Integer.toString(a);   // using Integer.toString(variable)
	     String str2 = Integer.toString(b);
	     System.out.println("String str1 = " + str1); 
	     System.out.println("String str2 = " + str2);
	     
	     System.out.println("---------------------------");
	     
	     int c = 1234;
	     String str3 = String.valueOf(c);        // String.valueof(variable)
	     System.out.println("String str3 = " + str3);
	     
	     System.out.println("---------------------------");
	     
	     int d = 1234;
	     Integer obj = new Integer(d); 
	     String str4 = obj.toString();     //obj.toString()
	     System.out.println("String str4 = " + str4);
	     
	     System.out.println("---------------------------");
	     
	 }
		
		

	}

