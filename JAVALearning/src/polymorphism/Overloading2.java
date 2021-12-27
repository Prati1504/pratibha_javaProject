package polymorphism;

public class Overloading2 extends Overloading1 {

	public static void over(boolean b)
	{
		System.out.println("over method of child class without argument is running");
	}
	public static void main(String[] args) 
	{
		over();
		over(20);
		over(20,true);
		over(false);
		
	}

}
