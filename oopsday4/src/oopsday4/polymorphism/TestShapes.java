package oopsday4.polymorphism;

public class TestShapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s = new Rectangle(10,65.75);
		double result =s.area();
		System.out.println(result);
		
		s = new Circle(6);
		result =s.area();
		System.out.println(result);
		
		s = new Square(55);
		result =s.area();
		System.out.println(result);

	}

}
