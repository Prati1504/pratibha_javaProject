package interviewProgramIMPORTANT;

public class CountSpacesInString {

	public static void main(String[] args) {
		
		String s=" u r clever than her";
		int count=0;
		
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch==' ')
				count++;
		}
		System.out.println(count);
	}

}
