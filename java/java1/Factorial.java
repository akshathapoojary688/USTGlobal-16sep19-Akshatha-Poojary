class Factorial
{
	public static void main(String[] args)
	{
		int a =facto(5);
		System.out.println("factorial of number is "+a);

	}
	static int facto(int num)
	{ 
		
		int fact =1;
		for(int i =1;i<=num;i++)
		fact =  fact*i;
		return fact;
	}
}
	