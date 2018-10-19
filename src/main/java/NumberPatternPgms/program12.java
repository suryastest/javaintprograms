package NumberPatternPgms;

import java.util.Scanner;

public class program12 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number" );
		int n= sc.nextInt();
		for(int i=1;i<=n;i++)
		{
		for(int j=i;j<=n;j++)
		{
		System.out.print(" "+j+" ");
		}
		for(int k=1;k<i;k++)
		{
		System.out.print(" "+k+" ");
		}
		System.out.println();
		}
	}

}
//output:
//Enter the number
//6
 //1  2  3  4  5  6 
 //2  3  4  5  6  1 
 //3  4  5  6  1  2 
 //4  5  6  1  2  3 
 //5  6  1  2  3  4 
 //6  1  2  3  4  5 
