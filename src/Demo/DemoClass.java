package Demo;

public class DemoClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Main
		
		B.C.m3();
		}

	
}
class A{
	static void m1() {
		System.out.print("m1");
	}
}

class B extends  A{
	static class C{
		static void m3() {
			System.out.print(("M1"));
		}
	}
}