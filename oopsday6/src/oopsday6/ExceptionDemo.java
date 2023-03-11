package oopsday6;
import java.util.Scanner;
import java.util.InputMismatchException;
// public class ExceptionDemo {
public class ExceptionDemo {
public static void main(String[] args) {
	System.out.println("Program task begin");
	try {
		Scanner scanner = new Scanner(System.in);
	int a = scanner.nextInt();
	int b = scanner.nextInt();
	
		int c=a/b;   //point of exception
		System.out.println(c);
		
	}catch(ArithmeticException e) {
		System.out.println("Can not / by zero");
	}catch(InputMismatchException e) {
	System.out.println("program completed task");
}
}} 
