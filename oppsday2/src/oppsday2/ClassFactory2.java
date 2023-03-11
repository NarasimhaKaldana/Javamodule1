package oppsday2;

public class ClassFactory2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // CarIface car = new CarIface();
		//CarIface car; //not reffering to any object
	CarIface car = new Car(5000,500,0,false);
	car.start();
	car.honk();
	car.move();
	car.stop();
	
	}

}
