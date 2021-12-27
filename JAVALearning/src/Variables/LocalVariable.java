package Variables;

public class LocalVariable
{
	int a=10;

	public static void m1()
	{
		int a=20;
		System.out.println(a);
		LocalVariable l1=new LocalVariable();
		System.out.println(l1.a);
		l1.m2();
		
	}
	public void m2()
	{
		int a=30;
		System.out.println(a);
		System.out.println(this.a);
	}
	public static void main(String[] args)
    {
		m1();
	}

}
