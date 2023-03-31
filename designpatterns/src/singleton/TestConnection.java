package singleton;

public class TestConnection {

	public static void main(String[] args) {
		
		
             Connection con1 = Connection.getConnection();
             Connection con2 = Connection.getConnection();
             
             
             for(int i=1;i<=10;i++) {
             if(con1.hashCode()== con2.hashCode())
            	 System.out.println("Connection in singleton");
             else
            	 System.out.println("Connection in not singleton");
            	 
             
             
             }
             
             }

}
