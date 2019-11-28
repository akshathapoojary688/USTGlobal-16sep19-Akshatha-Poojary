
public class TestA {
	
	public static void main(String[] args) {
		
		AutoMobile a;  //we can create a reference variable for interface 
		
		BMW b = new BMW ();
		b.gear();
		b.gps();
		b.abs();
		
		System.out.println("************************");
		
		Toyota t = new Toyota();
		t.gear();
		t.gps();
	}
	
		

}
