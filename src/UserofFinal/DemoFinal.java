package UserofFinal;

public class DemoFinal {
   final int b;
   static final int c;
   {
	  b=40; 
			  
   }
    
   static {
   c=40;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int a=10;
		a=40;
		
	}

}


 class A{
	final void display() {
		System.out.print("A:display");
	}
}
class B extends A{
	void display1() {
		System.out.print("B:display");
	}
}

		
class C extends B{
	{
		System.out.print("C:display");
	}
	
}
		
		
		