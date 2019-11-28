class Condition4
{
	public static void main(String[] args)
	{
		int weight = 50;
		double height = 5.2;
		double bmi = weight/height*height;
		if(bmi<18.5)
		{
			System.out.println("you are in the underweight range");
		}
		else if(bmi>=18.5 && bmi<=24.9)
		{
			System.out.println("you are in the healthy weight range");
		}
		else if(bmi>=25 && bmi<=29.9)
		{
			System.out.println("you are in the over weight weight range");
		}
		else  if(bmi>=30 && bmi<=39.9)
		{
			System.out.println("you are in the obese range");
		}
	}
}
