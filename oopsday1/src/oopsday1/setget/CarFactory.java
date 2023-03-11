package oopsday1.setget;

public class CarFactory {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Car jag = new Car();
        
        jag.setColor("Red");
        jag.setPrice(10000);
        jag.setBrand("Mahindra");
        jag.setModel("XUV500");
        
        
       System.out.println(jag.getColor());
       System.out.println(jag.getPrice());
       System.out.println(jag.getBrand());
       System.out.println(jag.getModel());
        
		/*
		 * jag.color = "White"; jag.price = 2000000; jag.brand ="Mahindra"; jag.model
		 * ="XUV500"; System.out.println(jag.color); System.out.println(jag.price);
		 * System.out.println(jag.brand); System.out.println(jag.model);
		 */
        
        
        
		
		  Car bmw = new Car(); 
		  bmw.setColor("Black");
		  bmw.setPrice(1500000); 
		  bmw.setBrand("BMW");
		  bmw.setModel("X350");
		  
		  System.out.println(bmw.getColor());
		  System.out.println(bmw.getPrice());
		  System.out.println(bmw.getBrand());
		  System.out.println(bmw.getModel());
		 
	}

}
