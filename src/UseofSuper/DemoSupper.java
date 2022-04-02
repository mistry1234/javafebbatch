package UseofSuper;

public class DemoSupper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       C c = new C(); 
	}
}
class A{
    A(){
	 System.out.print("A class 0 args constructor");
    }
    A(int a){
   	 System.out.print("A class 1 args constructor"); 
      }
}
class B extends A{	
	B(){
	super();	
	System.out.print("B class 0 args constructor"); 
	
	}
     B(int a){
    	
    	 System.out.print("B class 1 args constructor");  
     }
}
class C extends B{
	C(){
		super();
		 System.out.print("B class 0 args constructor"); 
   }	
} 
class D extands c{
System.out.print('this is to test git local)	
}	
