
public class Exmplevariablefile { 
	
    public static void main(String[] args) {
		// TODO Auto-generated method stub
      demovar.m1();
      //demovar.m2();
      System.out.println();  
      
	}
    
    void m3() {
    	
    }
    
}

class demovar{
	 int a=20;
	static int b=30;
	static void m1() {
		//System.out.print(a);
		demovar d= new demovar(); 
		System.out.print("a="+d.a);
		System.out.print("b="+b);
		System.out.print("this is stat1 menthod ");
		
	}
	static void m2() {
		m2();
	System.out.print(b);;
		System.out.print("this is instan method");	
	}
	
	}





	
		