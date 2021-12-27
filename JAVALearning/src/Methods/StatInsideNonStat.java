package Methods;

public class StatInsideNonStat {
	public static void staticMethod()
	{
		System.out.println("static method running");
	}
	
	public void NonStaticMethod()
	{
		staticMethod();
		System.out.println("non static method running");
	}
	

	public static void main(String[] args) 
	{
		StatInsideNonStat a=new StatInsideNonStat();
		a.NonStaticMethod();

	}

}
