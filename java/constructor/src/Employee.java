
public class Employee {
	String name;
	int eid;

	Employee(String empname,int empeid)
	{
		name = empname;
		eid = empeid;
	}
	void display()
	{
		System.out.println(name);
		System.out.println(eid);
	}
	public static void main(String[] args) {
		
		Employee e1 = new Employee("aksarj",143);
		Employee e2 = new Employee("surya",777);
		Employee e3 = new Employee("varun",333);
		
		e1.display();
		e2.display();
		e3.display();
		
	}


}
