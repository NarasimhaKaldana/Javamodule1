package userdefinedobjects;

public class Palindrome {
	public static void main(String[] args) {
		
	
int i = 32123;
String str = i+"";
StringBuilder sb = new StringBuilder(str);
StringBuilder rev = sb.reverse();
System.out.println(rev);
boolean result = str.equals(sb.toString());
System.out.println(result);
	

	}
}






