
public class TestB {
	static int b;
	int a;			
	{									//instance block  2nd it will execute
		b = 20;                         //we can also initilize static variables
		a = 10;							
		System.out.println("static block 1");
	}
	TestB(){	//whenever we create the objects all the instance blocks will be placed inside the construcot very first before constructor stmts 
		System.out.println("constructor execution");
	}
	public static void main(String[] args) {  //execution begins from here
		System.out.println("main method started");     //1st execute
		TestB b1 = new TestB();           //whenever we create a object all instance blocks gets executed
		TestB b2 = new TestB();			//here one more objects created so again all instance blocks gets executed
		System.out.println("main method ended");

	}
	{
		System.out.println("static block 2");   //3rd it will execute
	}

}
