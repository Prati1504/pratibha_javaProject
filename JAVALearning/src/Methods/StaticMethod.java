package Methods;

public class StaticMethod 
{
public static void Method1()
{
	System.out.println("static method1 running");
}
public static void Method2()
{
	Method1();
	System.out.println("static method2 running");
}
public static void main(String[] args)
{
	Method2();
}

}
