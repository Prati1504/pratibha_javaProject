package polymorphism;

public class Overriding2 extends Overriding1
{

	public void m1()
	{
		System.out.println("method of child class");
	}
	
	public static void main(String[] args) {
		Overriding1 a=new Overriding2();
		a.m1();
	}
}
