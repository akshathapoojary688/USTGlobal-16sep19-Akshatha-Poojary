class Area2
{
	public static void main(String[] args)
	{
		double c=circle(2);
		System.out.println("area of circle is"+c);
		
	}
	static double circle(int radious)
	{
		double circumference = 2*3.14*radious;
		return circumference;
	}
}
		