
public class DefaultValues {
	
	int c = 30;
	static int d; //static primitive variable
	
	static DefaultValues v; //static reference variable
	
	double y; //global variable will automatically take the defaultb values
	
	public static void add() {
		final int a; //only final access modifier  is supported for local variable not public private protected
	    final int b;  //local primitive
	 
		a = 10;
		b = 20;
		System.out.println(a);
		System.out.println(b);
		
	}
	
	public static void main(String[] args) {
		DefaultValues.add();
		DefaultValues v = new DefaultValues();
		System.out.println(v.c);
		System.out.println(v.y);
		System.out.println(DefaultValues.d);
	}

}
