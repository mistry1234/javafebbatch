
public class StudentJava {
	private static final int StudentRollNumber = 0;
	private static final String StudentAddress = null;
	String name;
	int rollNumber;
	String address;
	StudentJava(String name,int rollnumber,String Address){
		this.name=name;
		this.rollNumber=rollnumber;
		this.address=address;
	}
	void StudentInfo() {
		System.out.print("Name="+name);
		System.out.print("rollNumber="+rollNumber);
		System.out.print("address="+address);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StudentJava jay= new StudentJava("Jay",1001,"BAk");
		jay.StudentInfo();
		StudentJava tom= new StudentJava("tom",1032,"uk");
		tom.StudentInfo();
	}

}
