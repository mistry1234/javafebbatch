import java.util.Scanner;

public class SwitchCaseProgramjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=20;
	 	int b=40;
	 	System.out.print("enter your option");
	 	Scanner sc= new Scanner(System.in);
	 	int option=sc.nextInt();  
	 	switch (option)  {	
	    case 1:  {
		
		int c= a+b;
		System.out.print(c);
		break;
	    }
	    case 2: {
	    	int c= a-b;
	    	System.out.print(c);
	    	break;
	    }
	    case 3: {
	    	
	    	int c= a*b;
	    	System.out.print(c);
	    	break;
	    }
	    case 4: {
	    	
	    	int c= a/b;
	    	System.out.print(c);
	    	break;
	    }
	    default:
	    	System.out.print(" enter valid option betn 1 TO 4 ");
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	   
		
		
		
		
	    	
	   
}
	
		
	}
		
		
		
	}


