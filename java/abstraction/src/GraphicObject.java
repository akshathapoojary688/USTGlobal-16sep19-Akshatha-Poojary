
abstract public class GraphicObject {
	
	/*GraphicObject() {  //we can create constructor for abstract class
		
	}*/
	
	/*public static void add() {  //we can have static method in abstract class
		
	}*/
	
	//static abstract void shape(); cannot have static abstract method
	//final abstract void shape();   cannot have  final  method
	//private abstract void shape();   cannot have  private method
	
	
	
	void move() {
		System.out.println("move method");
	}
	abstract void shape();
		
}
