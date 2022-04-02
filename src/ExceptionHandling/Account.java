package ExceptionHandling;

public class Account {
	int balance =30000;
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account a= new Account(); 
		a.withdraw(40000);

	}
   void withdraw(int ammount) {
	   if(balance>ammount) {
		   balance=balance-ammount;
		   System.out.print("Tracation is done");
	   }
	   else {
		   throw new AccountBalanceIsLow("your account balance is low");
	   }
   }
   
}
