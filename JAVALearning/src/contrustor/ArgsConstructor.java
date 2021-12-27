package contrustor;

public class ArgsConstructor
{
	public ArgsConstructor(int a,int b)
	{
		System.out.println("args constructor running");
	}
	
	
	public static void main(String[] args) 
	{
		ArgsConstructor n=new ArgsConstructor(1,2);
	}

}
