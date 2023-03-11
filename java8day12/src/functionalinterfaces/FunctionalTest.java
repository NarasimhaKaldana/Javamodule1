package functionalinterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionalTest {
	public static void main(String[] args) {
		List<String> strings =Arrays.asList("Andhra pradesh","Telangana","Tamilnadu","Kerala","Karnataka");
		
		Function <String,Integer> f = (str) -> {
			return str.length();
			
		};
		Function <String,String> f1 = (str) -> {
			return str.toUpperCase();
			
		};
		Function <String,String> f2 = (str) -> {
			return str.toLowerCase();
			
		};
		//Function for uppercase
		//function for lowercase
		//function for reverse
		printLength(strings,f);
		printLower(strings,f2);
		printUpper(strings,f1);
		//for(String str : strings) {
			//System.out.println(f.apply(str));
		}// main ends
		
		public static void printLength(List<String> strings,Function<String,Integer>fRef) {
			for(String str : strings) {
				System.out.println(fRef.apply(str));
		}}
			public static void printUpper(List<String> strings,Function<String,String>f1) {
				for(String str : strings) {
					System.out.println(f1.apply(str));
			}}
				public static void printLower(List<String> strings,Function<String,String>f2) {
					for(String str : strings) {
						System.out.println(f2.apply(str));
				}
		    
	}
		}
