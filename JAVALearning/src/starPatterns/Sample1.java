package starPatterns;
 

public class Sample1 {

	public static void main(String[] args)
	{
		int star=1;                      //star=3
		int lines=6;
		for(int i=1;i<=lines;i++)
		{
			for(int j=1;j<=star;j++) //star=1
			{
				System.out.print(" * ");
			}
			System.out.println("  ");
			star++;
		}
		
	}

}
