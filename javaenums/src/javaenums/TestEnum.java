package javaenums;

public class TestEnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      DayOfWeek today = DayOfWeek.SATURDAY;
      System.out.println("Today is " + today.getName());
      //this would output:"Today is saturday".
      
      
      switch(today) {
      case MONDAY:
    	  System.out.println("Work hard");
    	  break;
      case TUESDAY:
    	  System.out.println("Work little more");
    	  break;
      case WEDNESDAY:
    	  System.out.println("Work work little more");
    	  break;
      case THURSDAY:
    	  System.out.println("Work work more ,weekend is around");
    	  break;
      case FRIDAY:
    	  System.out.println("yEAH weekend has arrived, party hard");
    	  break;
      case SATURDAY:
    	  System.out.println("enjoy morning coffee, go shopping");
    	  break;
      case SUNDAY:
    	  System.out.println("do all cleaning works,snoooooozzz");
    	  break;
      }
	}

}
