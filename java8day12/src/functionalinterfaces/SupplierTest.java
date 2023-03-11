package functionalinterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierTest {
	public static void main(String[] args) {
		List<String> strings =Arrays.asList("Andhra pradesh","Telangana","Tamilnadu","Kerala","Karnataka");
	Supplier<String> suplier = ()->{
		return new String("Hola!");
	};
	System.out.println(suplier.get());   
	}
}
