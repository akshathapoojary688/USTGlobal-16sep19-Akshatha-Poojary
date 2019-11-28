
public class Employee1 {
	String name;
	int eid;

	Employee1(String name,int eid)
	{
		this.name = name;
		this.eid = eid;
	}
	void display()
	{
		System.out.println(name);
		System.out.println(eid);
		this.sayHello();
	}
	void sayHello()
	{
		System.out.println("welcome to ust global company");
	}
	public static void main(String[] args) {
		
		Employee1 e1 = new Employee1("aksarj",143);
		Employee1 e2 = new Employee1("surya",777);
		Employee1 e3 = new Employee1("varun",333);
		
		e1.display(); 
		e2.display();
		e3.display();
		
	}


}
