package NumberPatternPgms;

public class program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int n=5;
		for(int i=1;i<n;i++){
		for(int j=1;j<=i;j++)
		System.out.print(j);
		System.out.println();
		}
		for(int i=n;i>=0;i--){
		for(int j=1;j<=i;j++)
		System.out.print(j);
		System.out.println();
		}
		System.out.println();
		}
	}

//output
//1
//12
//123
//1234
//12345
//1234
//123
//12
//1
