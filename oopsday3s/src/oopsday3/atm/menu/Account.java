package oopsday3.atm.menu;

public class Account {

	    private int actno;
	    private String name;
	    private String actType;
	    private double balane;
	    
	    
	    
		public int getActno() {
			return actno;
		}
		public void setActno(int actno) {
			this.actno = actno;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getActType() {
			return actType;
		}
		public void setActType(String actType) {
			this.actType = actType;
		}
		public double getBalane() {
			return balane;
		}
		public void setBalane(double balane) {
			this.balane = balane;
		}
		public Account(int actno, String name, String actType, double balane) {
			super();
			this.actno = actno;
			this.name = name;
			this.actType = actType;
			this.balane = balane;
		}
	    public Account() {
			// TODO Auto-generated constructor stub
		}
}
