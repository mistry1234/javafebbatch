
public class UseofThis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UseofThis u= new UseofThis();
		u.m2();

	}
	
	void m1() {
		System.out.print("This is m1 method");
	}
		
		void m2(){
			this.m1(); //
			System.out.print("This is m2 method");
		}

}

class demo{
	void m3() {
		UseofThis u= new UseofThis();
		u.m1();
		
		
		
		
	}
	
	
}

