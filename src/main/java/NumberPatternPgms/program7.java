package NumberPatternPgms;

public class program7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows,k=1;
		rows=4;
		for(int i=1;i<=rows;i++)
		{
		for(int j=1;j<=i;j++)
		System.out.print(k++);
		System.out.println();
		}
	}

}

//output
//1
//23
//456
//78910