import java.util.Scanner;

public class InnerForloop {

	public static void main(String[] args){
		// TODO Auto-generated method stub.
		System.out.print("Enter number of rows");
		Scanner sc= new Scanner(System.in);
		int totalRow=sc.nextInt();
		char ch=97;
		for(int row=1;row<=totalRow;row++) {
			for(int sp=1;sp<=totalRow-row;sp++) {
		        System.out.print(" ");
			}
		
		for(int st=1;st<=row;st++) {
			System.out.print("ch");
			ch=(char) (ch+1);
		}	
        System.out.print("0");
		}
		
	}
	
}
	



				
			
				
	
	
	


