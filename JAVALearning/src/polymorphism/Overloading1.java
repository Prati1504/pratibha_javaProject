package polymorphism;

public class Overloading1
{
	public static void over()
	{
		System.out.println("over method without argument is running");
	}
	public static void over(int a)
	{
		System.out.println("over method with argument is running");
	}
	public static void over(int a,boolean b)
	{
		System.out.println("over method with 2 arguments is running");
	}
}
