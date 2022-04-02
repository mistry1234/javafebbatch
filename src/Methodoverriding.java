
public class Methodoverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Login capOne= new Login();
		capOne.loginApp(10);
		System.out.print("-----------------------");
		Login city=new Login();
		city.loginApp(20);
	}

}

class Login {
protected int loginApp(int a) {
		System.out.print(" Enter user name");
		System.out.print("Enter Password");
		System.out.print("Click submit button");
		return 1;
		
	}
class Newlogin extends Login{
public int loginApp(int b) {
		System.out.print(" Enter user name");
		System.out.print("Enter Password");
		System.out.print("Enter Phone Number");
		System.out.print("Click submit button");
		return 2;
		
	}
} 
}
