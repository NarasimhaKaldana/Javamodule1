package oopsday4.polymorphism;

public class Rectangle extends Shape {
      private int length;
      private double breadth;
      public Rectangle() {
		// TODO Auto-generated constructor stub
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public double getBreadth() {
		return breadth;
	}
	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}
	public Rectangle(int length, double breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}
}
