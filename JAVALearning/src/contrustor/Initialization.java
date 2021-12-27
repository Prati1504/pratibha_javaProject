package contrustor;

public class Initialization
{
		int a;
		int b;
		
		public Initialization(int a,int b)
		{
			this.a=a;
			this.b=b;
			
		}

	public static void main(String[] args)
	
	{
		Initialization a=new Initialization(10,20);
		System.out.println(a.a);
		System.out.println(a.b);
		
	}

}
