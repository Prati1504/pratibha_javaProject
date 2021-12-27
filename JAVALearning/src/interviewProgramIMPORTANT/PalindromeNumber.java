package interviewProgramIMPORTANT;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		int number=212;                         
	    int temp=number;
		int result=0;                                           
		while(number!=0)
		{
			result=result*10+ number% 10; 
			number=number/10;     
		}
		if(result==temp)
			{
			System.out.println("palindrome number :" +result);
			}
		}

}
