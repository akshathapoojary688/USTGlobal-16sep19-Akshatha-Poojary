
public class Student {
	int usn;
	String name;
	String branch;
	char section;
	double marks;
	
	Student(int usn,String name, String branch, char section, double marks)
	{
		this.usn = usn;
		this.name = name;
		this.branch = branch;
		this.section = section;
		this.marks = marks;
	}
	void display()
	{
		System.out.println(usn);
		System.out.println(name);
		System.out.println(branch);
		System.out.println(section);
		System.out.println(marks);
		
	}
	public static void main(String[] args) {
		
		Student s1 = new Student(1,"akshatha","cs",'a',100);
		Student s2 = new Student(2,"anjali","cs",'a',95);
		Student s3 = new Student(3,"deepthi","is",'b',85);
		Student s4 = new Student(4,"pooja","mech",'c',99);
		Student s5 = new Student(5,"chaithra","cs",'c',88);
		Student s6 = new Student(6,"pallavi","ec",'e',86);
		Student s7 = new Student(7,"meghana","eee",'d',91);
		Student s8 = new Student(8,"poorvi","cs",'d',80);
		Student s9 = new Student(9,"pranjana","cs",'b',96);
		Student s10 = new Student(10,"deepali","cs",'b',93);
		
		s1.display();
		System.out.println("********************************");
		s2.display();
		System.out.println("********************************");
		s3.display();
		System.out.println("********************************");
		s4.display();
		System.out.println("********************************");
		s5.display();
		System.out.println("********************************");
		s6.display();
		System.out.println("********************************");
		s7.display();
		System.out.println("********************************");
		s8.display();
		System.out.println("********************************");
		s9.display();
		System.out.println("********************************");
		s10.display();
		
		
		
	}

}
