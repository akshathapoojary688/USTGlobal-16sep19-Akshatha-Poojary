
public class BMW implements AutoMobile,AutoMobileWithAbs{ //class can implements multiple interface
	
	public int gear() {
		System.out.println("gear() method of bmw");
		return 10;
	}
	public void gps() {
		System.out.println("gps() method of bmw");
	}
	@Override
	public void abs() {
		System.out.println("abs() method of bmw");
		
		
	}

}

