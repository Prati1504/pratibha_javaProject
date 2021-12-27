package interviewProgramIMPORTANT;

public class ToKeepOnlyNumbers {

	public static void main(String[] args) {
		
		String s="hgg26@^%^bd#*^663dfhhf@#@!!hdd567";

		s=s.replaceAll("[^0-9]", "");
		System.out.println(s);
	}

}
