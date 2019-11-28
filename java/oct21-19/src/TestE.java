
public class TestE {
	public static void main(String[] args) {
		Student s = new Student();
		Student.cname = "cec";
		s.name = "akshatha";
		s.usn = 007;
		System.out.println("college name is "+Student.cname);
		System.out.println("student name is "+s.name);
		System.out.println("usn is "+s.usn);
		
	}

}
