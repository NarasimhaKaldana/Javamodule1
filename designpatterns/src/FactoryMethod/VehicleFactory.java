package FactoryMethod;

public class VehicleFactory {
     public static Vehicle newInstance(String car) {
    	 Vehicle vehicle =null;
    	 if(car ==  null)
    		 return null;
    	 else if(car.equals("Seltos"))
    		 vehicle=new Seltos();
    	 else if(car.equals("Xcross"))
    		 vehicle=new Xcross();
		return vehicle;
     }
}
