package oopsday1;

public class CarFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Car jag = new Car();
        jag.color = "White";
        jag.price = 2000000;
        jag.brand ="Mahindra";
        jag.model ="XUV500";
        System.out.println(jag.color);
        System.out.println(jag.price);
        System.out.println(jag.brand);
        System.out.println(jag.model);
        
        
        Car bmw = new Car();
        bmw.color = "black";
        bmw.price = 1500000;
        bmw.brand = "BMW";
        bmw.model = "X350";
        
        System.out.println(bmw.color);
        System.out.println(bmw.price);
        System.out.println(bmw.brand);
        System.out.println(bmw.model);
        bmw = jag;
	}

}
