package inharitanceInJava;

public class HeirachicalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		B b= new B();
		//System.out.print("a="+b.a+" b="+b.b);
		//b.display();
		b.show();
		
//		C c= new C();
//		System.out.print("a="+c.a+"c="+c.c);
//		c.display();
//		c.print();
//		
//	A a= new A();
//	System.out.print("a="+a.a);
	
	}

}


class A{
private	int a=20;
	void display() {
		System.out.print("this is display method of class A");
		
	}
}



class B extends A{
	int b=30;
	void show() {
		display();
		System.out.print("a="+a);
		System.out.print("class B show  method");
		
	}
}
		
class C extends A{
	int c=40;
			void print() {
				System.out.print("this is print method class C");
				
					
		
		
	}
			public void show() {
				// TODO Auto-generated method stub
				
			}
};