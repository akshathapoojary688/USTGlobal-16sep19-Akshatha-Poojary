
public class Bus {
	
	int seats;
	String color;
	
	Bus(int seats,String color)
	{
		this.seats = seats;
		this.color = color;
	}
	Bus()
	{
		this(40);
		
	}
	Bus(int seats)
	{
		this(seats,"red");
		this.seats = seats;
	}
	void display()
	{
		System.out.println("welcome to redbus");
		System.out.println("available seats "+seats);
		System.out.println("color "+color);
	}
	public static void main(String[] args) {
		Bus b1 =new Bus();
		b1.display();
		System.out.println("********************************");
		
		Bus b2 =new Bus(50);
		b2.display();
		System.out.println("********************************");
		
		
		Bus b3 =new Bus(40,"blue");
		b3.display();
		System.out.println("********************************");
		
		
		
		
		
	}

}
