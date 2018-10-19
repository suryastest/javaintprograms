package NumberPatternPgms;

public class program13 {

	public void numberPattern(int rows) {
		// TODO Auto-generated method stub

		for(int row=0;row<rows;row++){
			for(int col=0;col<rows+1;col++){
			int number=0;
			if(row%2==0)
			{
			number=col<rows?row+1:row+2;
			}else
			{
			number=col==0?row+2:row+1;
			}
			System.out.print(number);
			}
			System.out.println();
			}
			}
			void publicstaticvoidmain(String[]args){
			// TODO Auto-generated method stub
				program13 obj= new program13();
			System.out.println("---------When Row No = 3---------------------");
			obj.numberPattern(3);
			System.out.println("---------When Row No = 5---------------------");
			obj.numberPattern(5);
			}
	}


