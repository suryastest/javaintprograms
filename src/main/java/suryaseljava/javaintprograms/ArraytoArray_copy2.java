package suryaseljava.javaintprograms;

public class ArraytoArray_copy2 {

	public static void main(String[] args) {
		// Program to Copy Elements From One Array2Array
		 char ch[] = {'S','O','F','T','W','A','R','E','T','E','S','T','I','N','G','B','L','O','G'};
	        String chStr = String.copyValueOf(ch);   // we use String.copyValueof(array)
	        System.out.println(chStr);
	        String subStr = String.copyValueOf(ch,8,7);    //copyValueOf(char[] data, int offset, int count)  
	        System.out.println(subStr);
	}

}
