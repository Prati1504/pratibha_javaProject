package Methods;

public class NonStatInsideStat
{
	
		public void NonStaticMethod()
		{
			System.out.println("non static method running");
		}
		public static void StaticMethod()
		{
			 NonStatInsideStat n1=new NonStatInsideStat();
			n1.NonStaticMethod();
			System.out.println("static method running");
		}
		public static void main(String[] args)
		{
			StaticMethod();
		}
	}




