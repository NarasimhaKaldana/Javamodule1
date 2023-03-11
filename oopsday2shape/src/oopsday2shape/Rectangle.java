package oopsday2shape;

public class Rectangle implements Shape {
	private double length1;
	private double breadth1;
	public Rectangle(int i, int j) {
		// TODO Auto-generated constructor stub
	}
	
	public double getLength1() {
		return length1;
	}
	public void setLength1(double length1) {
		this.length1 = length1;
	}
	public double getBreadth1() {
		return breadth1;
	}
	public void setBreadth1(double breadth1) {
		this.breadth1 = breadth1;
	}
	
	@Override
	public void area() {
		
		double reatarea = length1*breadth1;
		System.out.println(reatarea);
		// TODO Auto-generated method stub
        
        
	}


public static void main(String args[]) {
	Shape s = new Rectangle(4,5);
	s.area();
}
}
