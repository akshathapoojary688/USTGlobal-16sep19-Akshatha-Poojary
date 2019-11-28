
public class Employee2 {
	String name;
	int eid;
	long adharno;
	
	Employee2(String name,int eid,long adharno)
	{
		this.name =name;
		this.eid = eid;
		this.adharno = adharno;
	}
	Employee2(String name,int eid)
	{
		this.name = name;
		this.eid = eid;
	}
	Employee2(int eid,String name)
	{
		this.eid = eid;
		this.name = name;
	}
	void display()
	{
		System.out.println("hi "+name+" welcome to ust global");
		System.out.println("employee name is "+name);
		System.out.println("id is "+eid);
		System.out.println("adhar no is "+adharno);
		
	}
	public static void main(String[] args) {
		Employee2 e1 = new Employee2("akshatha",1,85687451);
		e1.display();
		System.out.println("**************************");
		Employee2 e2 = new Employee2("anjali",3);
		e2.display();
		System.out.println("*************************");
		Employee2 e3 = new Employee2(7,"deepu");
		e3.display();
		System.out.println("*********************");
	}
	

}
