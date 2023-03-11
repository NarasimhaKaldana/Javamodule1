package functionalinterfaces;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.Arrays;
import java.util.List;

public class ConsumerTest {

	public static void main(String[] args) {
	     
		List<String> strings =Arrays.asList("Andhra pradesh","Telangana","Tamilnadu","Kerala","Karnataka");
	
		Consumer<String> consumer = (str)->{
			System.out.println(str);
		};
		
		consumer.accept("I am doing great");
		   for(String str : strings) {
			   consumer.accept(str);
		   }
	
		   printStrings(strings,consumer);
	
	
	}// end of main
	
	public static void printStrings(List<String> strings,Consumer<String>c) {
	 
	for(String str : strings) {
		   c.accept(str);
	}

}
}
