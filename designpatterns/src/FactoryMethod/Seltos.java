package FactoryMethod;

public class Seltos implements Vehicle {

	public Seltos() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void start() {
		System.out.println("Started......."+getClass());
		// TODO Auto-generated method stub

	}

	@Override
	public void stop() {
		System.out.println("Stopped......."+getClass());
		// TODO Auto-generated method stub

	}

	@Override
	public void honk() {
		System.out.println("Palm palm......."+getClass());
		// TODO Auto-generated method stub

	}

	@Override
	public void move() {
		System.out.println("It is moving......."+getClass());
		// TODO Auto-generated method stub

	}

}
