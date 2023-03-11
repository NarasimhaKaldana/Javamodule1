package oopsday3s;

public class Compare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Rectangle r1 = new Rectangle();
      Rectangle r2 = new Rectangle();
      
      Triagle t1 = new Triagle();
      Triagle t2 = new Triagle();
      
      
      //comparing primitives
      int a = 10;
      int b = 35;
      
      boolean result = a==b;   //are they same/equal
      // comparing objects  1.comparing references 2. comparing members
      result = r1 == r2;
      System.out.println(result);   //false
      result = t1 == t2;
      System.out.println(result);  //false
      
     // result = r1 == t1;   //incompatible types
      
      Rectangle r3 = r1;
      result = r3 == r1;
      System.out.println(result);
      System.out.println(r1.hashCode());
      System.out.println(r3.hashCode());
      
      System.out.println(r2.hashCode());
      result = r1.equals(r2);          //not applicable for primitives
      System.out.println(result);    //false
      result = r1.equals(r3);
      System.out.println(result);    //true
      r1.setLength(35.5);
      r1.setBreadth(75.45);
      r2.setLength(35.5);
      r2.setBreadth(75.45);
      if(r1.getBreadth() == r2.getBreadth() && r1.getLength() == r2.getLength())
    	  System.out.println("They have same length and breadth");
      else
    	  System.out.println("They don't have same length and breadth");
      
      
      t1.setS1(35.5);
      t1.setS2(45.75);
      t1.setS3(65.5);
      //we are not comparing objects r1 and t1 ;
      // we are comparing data members of two objects;
      if(r1.getLength() == t1.getS1())
    	  System.out.println("the length and s1 are same");
      else
    	  System.out.println("the length and s1 are not same");
	}

}
