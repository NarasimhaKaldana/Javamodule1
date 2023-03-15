package testlambdas;

public class LamdaSwichCase {

	  static double calculate(String operator, double x, double y) {
		  return switch (operator) {
		  case "+" -> x+y;
		  case "-" -> x-y;
		  case "*" -> x*y;
		  case "/" -> {
			  if (y==0) {
				  throw new IllegalArgumentException("Can't devide by 0");
				  
			  }
			  yield x/y;
		  }    
			  default -> throw new IllegalArgumentException("Unknown  operation");
		  };
		  
		  
	  }
	
	public static void main(String[] args) {
                    LamdaSwichCase l = new LamdaSwichCase();
                    l.calculate("+", 5, 2);
                    System.out.println(l.calculate("+", 5, 2));
                    
	}

}
