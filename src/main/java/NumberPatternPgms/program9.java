package NumberPatternPgms;

public class program9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,k;
		int n=5;
		for(i=1;i<=n;i++){
		for(j=1;j<=i;++j)
		System.out.print(j);
		for(k=n-i;k>=1;k--)
		System.out.print("*");
		System.out.println();
		}
	}

}
