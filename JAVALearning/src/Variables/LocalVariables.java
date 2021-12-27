package Variables;

public class LocalVariables
{
	static int a=10;
	
	public static void m1()
	{
		int a=20;
		System.out.println(a);
		System.out.println(LocalVariables.a);
	}
	
	public void m2()
	{
		int a=30;
		System.out.println(a);
		System.out.println(LocalVariables.a);
	}
	
	
	public static void main(String[] args) 
	{
		m1();
		LocalVariables l1=new LocalVariables();
		l1.m2();

	}

}
