package UserofFinal;

public class DemoFinal {
   final int b;
   static final int c;
   {
	  b=40; 
			  
   }
    
   static {
   c=40
	   System.out.print("Static block c="+c);
	   
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DemoFinal d= new DemoFinal();
		DemoFinal d1= new DemoFinal();
		DemoFinal d2= new DemoFinal();
		DemoFinal d3= new DemoFinal();
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
		
		
		
