import java.lang.reflect.Method;

public class Methodinjava {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub	//
        MethoDemo md=new MethoDemo();  //object
        int result=md.addTwoNumber(20,30);
        int multResult2=md.mult(2, 10);
        System.out.print("addiation result is ="+result+"mult= "+multResult2);
		int result2=md.addTwoNumber(30, 100);
        System.out.print("addition result2 is=+result2");
        int result3=md.addTwoNumber(100, 120);
        System.out.print("addition result3 is ="+result3);
	}  

}

class MethoDemo{
	int addTwoNumber(int a,int b) {
		int c=a+b;
		return c;
	}
   int mult(int a,int b) {
	int c=a*b;
	return c;
	}
}



