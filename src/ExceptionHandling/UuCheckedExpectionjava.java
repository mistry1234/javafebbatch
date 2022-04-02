package ExceptionHandling;

public class UuCheckedExpectionjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=30;
		try {
			System.out.print("this is try" );
		System.out.print(a/0);
	System.out.print("end of try Block");
		} 
		catch (Exception e ) {
		e.printStackTrace();
		System.out.print(e.getMessage());
			System.out.print("this is catch Block");
			System.out.print(a/1);
				    
		}
		System.out.print("Hello this is java program");
		System.out.print("Hello this is java program");
		System.out.print("Hello this is java program");
		

	}

}
