package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Test1 {

	public static void main(String[] args) {
         ArrayList<String> list = new ArrayList<>();
         list.add("sun");
         list.add("moon");
         list.add("jupiter");
         list.add("uranus");
         list.add("pluto");
         list.add("mars");
         list.add("venus");
           Predicate<String> p = (str)->{
        	  return str.length()>3 || str.length() <10;
           };
         long count = list.stream().filter(p).count();
         System.out.println(count);
         
         
         List<String> outList = list.stream().map((str)->str.toUpperCase()).collect(Collectors.toList());
         System.out.println(outList);
         
         Consumer<String> c = (str) ->{
        	 System.out.println(str);
        	 
         };
         list.stream().forEach(c);
         list.stream().filter(p).map((str)->str.toUpperCase()).forEach(c);
         list.stream().forEach(System.out::println);
         List<String> outList1 = list.stream().map(str -> str.toUpperCase()).collect(Collectors.toList());
        		 System.out.println(outList1);
         long counts = list.stream().filter(str -> str.length()>3).count();
         System.out.println(count);
                 
	}
    
}
