package interviewProgramIMPORTANT;

import java.util.HashMap;
import java.util.Set;

public class DuplicateStringInArray {
public static void main(String[] args) {
		
		String[] St={"pratibha","shivaji","ghadge","sharad","shivaji","ghadge"};
		
		
	    HashMap<String,Integer> smap =new HashMap<String,Integer>();
	    
	    for(String str:St)
	    	if(smap.containsKey(str))
	    		smap.put(str, smap.get(str)+1);
	    	else
	    		smap.put(str, 1);                //check array for total iteration
	                                                   //   return set of keys 
	    
	   Set<String> keys= smap.keySet();//to check each key
	   for(String key:keys)
		   if(smap.get(key)>1)
			   System.out.print(key + ":" + smap.get(key)+  " ");
	   
	   
	   
	    		
	}


}
