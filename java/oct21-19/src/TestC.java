
public class TestC {
	public static void main(String[] args) {
		
		Person.color = "white";
		Person.sleep();
		
		System.out.println("color is "+Person.color);
		
		Person p =new Person();
		p.name = "akshatha";
		p.age = 22;
		System.out.println("name is "+p.name);
		System.out.println("age is "+p.age);
		p.eat();
		
		p.color = "black";
		System.out.println("color is "+Person.color);
		
		System.out.println("********************************************");
		
		Person p2 = new Person();
		p2.age =23;
		p2.name = "deepu";
		System.out.println("name is "+p2.name);
		System.out.println("age is "+p2.age);
		
		
		
		
	}

}
