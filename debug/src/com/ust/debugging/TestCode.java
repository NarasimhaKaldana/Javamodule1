package com.ust.debugging;

public class TestCode {

	
		int a;
		boolean b;
		
		int factorial(int n) {
			if(n<1)
				return 1;
			return n* factorial(n-1);
		}
		int substract(int n) {
			return n-1;
		}
		void m1(){
		   System.out.println("from m1" +this.a+this.b);
		  }

		 void m2(){
		    this.b= false;
		    System.out.println('1'+a++);
		    System.out.println('2');
		    System.out.println('3');
		    this.m1();
		    this.b=true;
		    System.out.println('4'+a++);
		    System.out.println('5');
		    System.out.println('6'+a--);
		 }
		    public static void main(String[] args) {    
		  
		    	new TestCode().factorial(5);
		    }

}
