
public class TestA {
	static int a;
	static {
		a = 10;
		System.out.println("static block 1");          //1st it will execute
	}
	TestA() {                                         //constructor always executed after the static block
		System.out.println("TestA constructor");
	}
	public static void main(String[] args) {
		TestA t1 = new TestA();								
		System.out.println("a value is "+a);

	}
	static {                                        //2nd this block gets executed
		a=20;
		System.out.println("static block 2");
	}
	static {                                         //3rd this will executed
		a =40;
		System.out.println("static block 3");
	}

}
