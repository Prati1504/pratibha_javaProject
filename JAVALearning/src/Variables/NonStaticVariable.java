package Variables;

public class NonStaticVariable
{
	int a=10;
	
	public static void M1()
	{
		NonStaticVariable n1=new NonStaticVariable();
		System.out.println(n1.a);
		
	}
	public void M2()
	{
		System.out.println(a);
		a=20;
		System.out.println(a);
	}
	
	public static void main(String[] args)
	{
	M1();
	NonStaticVariable s1=new NonStaticVariable();
	s1.M2();
	

	}

}
