package Variables;

public class StaticVariable
{
	static int a=10;                 //static variable declaration
	
	public void NonStat()
	{
		System.out.println("this is static global variable calls inside method directly:"+ a);      //calling static global variable directly
		a=20;                      //re-initialization of static global variable in non-static method
		
		int a=40;                   //local variable with same name
		System.out.println("this is local variable:"+ a);
		
		StaticVariable.a=50;       // re-initialization of static global variable after declaring the local variable with same name
		
	}
	public static void main(String[] args)
	{
		StaticVariable s1=new StaticVariable();
		s1.NonStat();
		System.out.println("this is static global variable after re-iniatilization: "+ a);        
		a=30;                       //again re-initialization of static variable in static main method
		System.out.println(a);

	}

}
