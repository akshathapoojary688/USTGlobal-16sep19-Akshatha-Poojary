
public class Student {  //if it is final class cannot be inherited
	String name;
	int rollno;
	final String cname = "cec"; //final variable need to be intialized
	final int cid;
	Student()
	{
		this.cid = 7;  //we need to initialize final variable in each and every constructor || initialize globally like cname
	}
	Student(String name,int rollno,int cid)
	{
		this.name = name;
		this.rollno = rollno;
		this.cid = cid;  //we can also initialize final variable in constructor
		
	}
	final void printDetails() {
		System.out.println("hi " +name + " welcome to " +cname);
	}
	final void printDetails(String name) {  //we can overload final method
		System.out.println("hi " +name + " welcome to " +cname);
	}

}

