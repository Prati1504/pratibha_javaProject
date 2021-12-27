package interviewProgramIMPORTANT;

import java.util.HashMap;
import java.util.Set;

public class DuplicateCharInString {

	public static void main(String[] args) {
		
		String St="pratiejfelbhaghadgaewrgesghhivshrearaaji";
		
		char[] ar=St.toCharArray();
		
	    HashMap<Character,Integer> smap =new HashMap<Character,Integer>();
	    
	    for(char arSeprate:ar)
	    	if(smap.containsKey(arSeprate))
	    		smap.put(arSeprate, smap.get(arSeprate)+1);
	    	else
	    		smap.put(arSeprate, 1);                //check array for total iteration
	                                                   //   return set of keys 
	    
	   Set<Character> keys= smap.keySet();//to check each key
	   for(char key:keys)
		   if(smap.get(key)>1)
			   System.out.print(key + ":" + smap.get(key)+  " ");
	   
	   
	   
	    		
	}

}
