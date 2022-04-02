package AbstractClassInJava;

public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b= new B();
		b.display();
		b.show();
		b.print();
	}

	
}

abstract class A {
	A(){
	System.out.print("This is constructor of class A");
  }
	void display() {
		System.out.print("class A display method");
	}	
		abstract void show();
		abstract void print();
		}
	class B extends A{
		 void show() {
			 System.out.print("Class B show method");
      }
	 
		 void print() {
		 System.out.print("this B show Method");
			
	}
			
			}

	


