package ExceptionHandling;

public class MultipleCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		String s=null;
	int a []= {20,30,40};
	int b=a[1]/0;
		System.out.print(a[1]);
		s.length();
		}
	catch(ArrayIndexOutOfBoundsException e) {
		    System.out.print("ArrayIndexOutOfBoundsExceptions block");
			System.out.print(e.getMessage());
		}
	catch(NullPointerException e) {
				System.out.print("NullPointerException block");
				System.out.print(e.getMessage());
			}
		
		
	
		
		finally {
			System.out.print("This is a finally block");
			}
		
     	System.out.print("This is end of program");
		
		
     	   }

	}
	

	