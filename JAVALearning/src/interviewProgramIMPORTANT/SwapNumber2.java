package interviewProgramIMPORTANT;

public class SwapNumber2 {

	public static void main(String[] args)
	{
		int a=10;
		int b=20;
		
		b=a+b;                 // swapping of number without using third variable
		a=b-a;
		b=b-a;
		System.out.println(a);
		System.out.println(b);
	}

}
