package oop;

public class DemoInheritance {
public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	C c = new C();
	c.display();
	c.printNumber();
	c.show();
	System.out.print("a="+c.a+" b="+c.b+"c="+c.c);
	
	}
}
class A {
	int a=30;
	void display()  {
	System.out.print("a="+a);
	}
}
class B extends A{
		int b=50;
		void printNumber() {
				System.out.print("b="+b);		
		}
	}				
	
class C extends B{
		int c=50;
		void show() {
			System.out.print("c="+c);
		}
}		

class D extends C{
	
}
