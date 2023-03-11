package functionalinterfaces;
import java.util.function.Predicate;
import java.util.Arrays;
import java.util.List;

public class PredicateTest {

	public static void main(String[] args) {
		
		List<String> strings =Arrays.asList("Andhra pradesh","Telangana","Tamilnadu","Kerala","Karnataka");
	
	          Predicate<String> p = (String str) ->{
	        	  return str.length()>7;
	        	  
	          };
	         // System.out.println(p.test("Holla!"));
	          for(String str: strings)
	        	  System.out.println(p.test(str));
	          desiredLength(strings,p);
	}

	
	      public static void desiredLength(List<String>strings,Predicate<String> p) {
	        
	      for(String str: strings)
        	  System.out.println(p.test(str));
}
}
