package inharitanceInJava;

public class polyDemo {
	private String add;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		polyDemo p=new polyDemo();
		System.out.print(p.add(20, 40));
		System.out.print(p.add(20f, 30));
		System.out.print(p.add(60, 20));
	
	}
		
		int add(int a,int b) {
		    return a+b;
		}
		int add1(int a, int b, int c ) {
			return a+b+c;
		}
		
			float add(float a, int b) {
			return a+b;
		}
			int add3(int a, int c, int d ) {
				return a+c+d;
			
		}

}  
