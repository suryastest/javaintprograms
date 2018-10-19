package NumberPatternPgms;

import java.util.Scanner;

public class program11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("How many rows you want in this pattern?" );
		int rows=sc.nextInt();
		System.out.println("Here is your pattern....!!!");
		for(int i=1;i<=rows;i++)
		{
		for(int j=1;j<=rows-i;j++)
		{
		System.out.print(1);
		}
		for(int j=1;j<=i;j++)
		{
		System.out.print(i);
		}
		System.out.println();
		}
		sc.close();
		}
	}

//output
//How many rows you want in this pattern?
//5
//Here is your pattern....!!!
//11111
//11122
//11333
//14444
//55555