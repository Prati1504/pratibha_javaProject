package contrustor;

public class UseOfThis
{
	public UseOfThis(int a,int b)
	{
		System.out.println("top constructor is running");
	}
	public UseOfThis(int a,int b,boolean c)
	{
		this(1,2);
		System.out.println("mid constructor is running");
	}
	
	public UseOfThis()
	{
		this(1,2,true);
		System.out.println("low constructor is running");
	}

	public static void main(String[] args) {
		
		UseOfThis a=new UseOfThis();
	}

}
