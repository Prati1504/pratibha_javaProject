package interviewProgramIMPORTANT;

public class RemoveSpecialCharFromString {

	public static void main(String[] args) {
		
		String s="hgg26@^%^bd#*^663dfhhf@#@!!hdd567";
		s=s.replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println(s);
	}

}
