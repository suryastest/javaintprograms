package suryaseljava.javaintprograms;

public class ArraytoArray_copy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char  ap[]={'a','b','c','d','e','f'};
		 char [] bp=new char[4];
		 System.arraycopy(ap,0, bp, 0,4);    //  arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
		 System.out.println("New String b=" + new String(bp));
		
		
	}

}
