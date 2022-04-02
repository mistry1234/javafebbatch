package StringPrograms;

public class DemoString {
	
//	private static Object 'a';

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String s="Hello java Welcome";
	StringBuffer sb = new StringBuffer("Hello java Welcome");
	StringBuilder sb3=new StringBuilder("Hello");
	
	StringBuffer sb1=new StringBuffer("Welcome");
		System.out.print("new string"+s.concat("Welcome to Java Class"));
	    System.out.print(s);
	    sb.append("Welcome to Java Class");
	    System.out.print("String s="+s);
	    System.out.print("SB="+sb);
	    
	    String s1= new String();
	    String s2= new String("Hello Java");
	    String s3= new String(sb);
	    String s4= new String(sb3);
	   
	    char ch[]= {'a','b','c','d'};
	    String s5= new String(ch);
	    System.out.print("s5="+s5);
	    
	    byte b[]= {65,67,68,69};
	    String s6= new String (b);
	    System.out.print("s6"+s6);
	    
	    
//	    System.out.print("s3="+s3);
//	    s3.
	    
//	}
	
	}
	

}
