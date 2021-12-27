package inheritance;

public class ChildClass extends ParrentClass {
	
	public void m3()
	{
		System.out.println("child class method m3 is running");
	}

	public static void main(String[] args)
	{
		ChildClass c=new ChildClass();
		c.m1();
		m2();
		c.m3();
	}

}
