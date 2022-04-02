
public class DemoThis {

	DemoThis(){
		this (10);
		System.out.print("0 args constructor");	
	}
	
	DemoThis(int a){
		this(10,20);
		System.out.print("1 args constructor");
	}
	
		
		DemoThis(int b,int c){
			this(20,30,40);
			System.out.print("2 args constructor");	
		}
	
			DemoThis(int a,int b,int c){
				System.out.print("0 args constructor");	
			}
				
	

			public static void main(String[] args) {
		// TODO Auto-generated method stub

		DemoThis dt= new DemoThis();
		
	}

}
