package paramtest;

public class PrimeNumber {
     public boolean validate(int n) {
    	 for(int i=2;i<n/2;i++)
    	 {  if(n%i==0)
    		 return false;
    		 
    	 }return true;
    	 }
}

          public static

/*
 * package paramtest;
 * 
 * public class PrimeNumber { public boolean validate(final Integer primeNumbe))
 * {
 * 
 * for(int i=2;i<(primeNumber/2);i++) { if(primeNumber%i==0) { return false;
 * 
 * }return true; } }
 * 
 */