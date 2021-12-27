package Methods;

public class NonStaticMethod
{
public void Method1()
{
	System.out.println("non static method1 running");
}
public void Method2()
{
	Method1();
	System.out.println("non static method2 running");
}
public static void main(String[] args)
{
	NonStaticMethod n1=new NonStaticMethod();
	n1.Method2();
}
}
