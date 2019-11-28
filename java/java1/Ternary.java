class Ternary
{
	public static void main(String[] args)
	{
		int a=10;
		int b = 30;
		int c = 20;
		 int d = (a>b && a>c)?a:(b>c)?b:c;
		System.out.println("greater is "+d);
	}
}