package loops;

public class ForLoopFactorialNumber {

	public static void main(String[] args)
	{
		int factorial=1;
		for(int fact=1;fact<=5;fact++)
		{ 
		factorial=factorial*fact;
		}
		System.out.println(factorial);
	}

}
