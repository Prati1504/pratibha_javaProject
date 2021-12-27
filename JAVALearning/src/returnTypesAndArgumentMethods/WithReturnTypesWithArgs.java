package returnTypesAndArgumentMethods;

public class WithReturnTypesWithArgs
{

		public static boolean WithArgs(int a,int b)
		{
			int c=a+b;
				if(c==30)
					return true;
			return false;
		}
	public static void main(String[] args) 
	{
		System.out.println(WithArgs(10,20));
	}

}
