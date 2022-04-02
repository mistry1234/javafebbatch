package InterfaceJava;

public abstract class DemoInterfaceInjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c= new C();
		c.display();
		

		
		
		
    }

}

   interface A{
	   final int a=10;
       void display();
}		
		

   
   interface B{
	   int a=20;
	 void display();
	

   }

   class C implements B,A{
	public void display() {
		System.out.print("class c display method"+B.a);
		System.out.print("class c display method"+A.a);
	     }
	}	
	
   

//
//class D implements A{
//	public void display() {
//	System.out.print("class D display method");
//   }
//    public void show() {
//    	System.out.print("class D show method");
//    }
//}
//
//
//class B implements A{
//   public void display() {
//		System.out.print("this display method");
//	}
//   public void show() {
//	   System.out.print("this is shoe method");
   

  

