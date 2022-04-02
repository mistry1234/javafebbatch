package WrapperClasses;

import java.security.PrivateKey;

public class DemoWrapper {
	private int i=10;
	public static void main(String[] args) {
			// TODO Auto-generated method stub
		
		int i=10;
		Integer i1=new Integer(i);
		System.out.print(i1);
		int i3=i1.intValue();
		
		float f= 40.5f;
		Float f1= new Float(f);
		float f2=f1.floatValue();

	}

}
