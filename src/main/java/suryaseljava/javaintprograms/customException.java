package suryaseljava.javaintprograms;

@SuppressWarnings("serial")

public class customException extends Exception {

	public customException() 
	{
		 super();
		 System.out.println("MyException");	
	}
	 public String getFaultMessage()
	 {
	 return "U r not an adult ....";
	 }
	}

