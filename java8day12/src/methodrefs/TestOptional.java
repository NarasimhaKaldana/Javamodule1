package methodrefs;

import java.util.Optional;

public class TestOptional {

	public static void main(String[] args) {
     String str = null;
     String str2 = "hello";
    //Optional<String> optional = Optional.of(str);
    
   // System.out.println(optional.get());
    Optional<String> optional2 = Optional.ofNullable(str2);
    if (optional2.isPresent())
    	System.out.println("value is present"+ optional2.get());
    else
    	System.out.println("is null"+ optional2.get());
    System.out.println("is null"+ optional2.orElse("str is not initialized"));
    
	}

}
