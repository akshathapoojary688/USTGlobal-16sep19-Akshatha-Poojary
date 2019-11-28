class Area1
{
	
	static double areaOfCircle(int radious)
	{
		double area = 3.14*radious*radious;
		return area;
	}

	static double circumferenceOfCircle(int radious)
	{
		double circumference = 2*3.14*radious;
		return circumference;
	}

	static boolean oddOrEven(int number)
	{
		if(number%2 == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public static void main(String[] args)
	{
		double c= areaOfCircle(2);
		System.out.println("area of circle is"+c);
		double d = circumferenceOfCircle(3);
		System.out.println("circumference of circle is"+d);
		boolean e = oddOrEven(6);
		System.out.println(e);
		
	}
}
		