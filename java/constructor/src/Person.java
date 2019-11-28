
public class Person {
	String name;
	int age;
	Person(String pname,int page)
	{
		name = pname;
		age = page;
	}
	void dispaly()
	{
		System.out.println(name);
		System.out.println(age);
	}
	public static void main(String[] args) {
		
		Person p = new Person("deepu",23);
		p.dispaly();
		
		Person p1 = new Person("anju",73);
		p1.dispaly();
		
		Person p2 = new Person("abhay",77);
		p2.dispaly();
	}

}
