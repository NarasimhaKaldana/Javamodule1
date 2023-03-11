package userdefinedobjects;

//import java.util.Collection;
import java.util.HashMap;

public class FrequencyHashMapTest {

	public static void main(String[] args) {
  
		
		//String str = "simha simha simha simha simha simha simha simha simha simha simha";
		String str = "It is up to each collection to determine its own synchronization policy. In the absence of a stronger guarantee by the implementation, undefined behavior may result from the invocation of any method on a collection that is being mutated by another thread. This includes direct invocations, passing the collection to a method that might perform invocations, and using an existing iterator to examine the collection. Implementations may optionally handle the self-referential scenario, however most current implementations do not do so.";
        String words[] = str.split(" ");
        System.out.println("Total words="+words.length);
        HashMap<String,Integer> str1 = new HashMap<>();
        
        
        
        
        for(String i : words) {
        	Integer x = str1.get(i);
        	if(x==null) {
        		str1.put(i, 1);
        		
        	}
        	else {
        		str1.put(i, x+1);
        	}
        }System.out.println(str1);
	      
	}

}
