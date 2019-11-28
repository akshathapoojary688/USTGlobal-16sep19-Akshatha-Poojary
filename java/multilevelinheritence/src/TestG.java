
public class TestG {
	public static void main(String[] args) {
				
		FirstGen f = new FirstGen();
		f.call();
		f.msg();
		
		System.out.println("**************************");
		
		SecondGen s = new SecondGen();
		s.call();
		s.msg();
		s.games();
		
		System.out.println("**************************");
		
		
		ThirdGen t = new ThirdGen();
		t.call();
		t.msg();
		t.games();
		t.camera();

	}

}
