package multithreading;

public class MyThread extends Thread {
       
	private String name;
	public MyThread() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	public MyThread(String name) {
		super();
		this.name = name;
		
		// TODO Auto-generated constructor stub
	}   public void run() {
		for(int i = 1;i<600; i++) {
			System.out.println(name);
		}
	}
}



