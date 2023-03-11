package oopsday1.withbusinessmethods;

public class CarFactory {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Car jag = new Car("Yellow",400000,"toyota","fortuner");
        jag.start();
        jag.changeGear(1);
        jag.stop();
		/*
		 * jag.setColor("Red"); jag.setPrice(10000); jag.setBrand("Mahindra");
		 * jag.setModel("XUV500");
		 */
       System.out.println(jag.hashCode());
       System.out.println(Integer.toHexString(jag.hashCode()));
       System.out.println(jag);
        
       System.out.println(jag.getColor());
       System.out.println(jag.getPrice());
       System.out.println(jag.getBrand());
       System.out.println(jag.getModel());
        
		/*
		 * jag.color = "White"; jag.price = 2000000; jag.brand ="Mahindra"; jag.model
		 * ="XUV500"; System.out.println(jag.color); System.out.println(jag.price);
		 * System.out.println(jag.brand); System.out.println(jag.model);
		 */
        
        
        
		
		  Car bmw = new Car("grey",5000,"renault","kwid"); 
		  bmw.start();
	        bmw.changeGear(1);
	        bmw.stop();
			/*
			 * bmw.setColor("Black"); bmw.setPrice(1500000); bmw.setBrand("BMW");
			 * bmw.setModel("X350");
			 */
		  
		  System.out.println(bmw.getColor());
		  System.out.println(bmw.getPrice());
		  System.out.println(bmw.getBrand());
		  System.out.println(bmw.getModel());
		 
	}

}
