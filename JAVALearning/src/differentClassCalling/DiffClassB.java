package differentClassCalling;

public class DiffClassB
{	
	public static void StaticMethod2()
	{
		System.out.println("static method of class B is running ");
	}
	public void NonStaticMethod2()
	{
		System.out.println("non static method of class B is running ");
	}

	public static void main(String[] args)
	{
		DiffClassA.StaticMethod();
		DiffClassA d1=new DiffClassA();
		d1.NonStaticMethod();
		
		StaticMethod2();
		DiffClassB s1=new DiffClassB();
		s1.NonStaticMethod2();
	}

}
