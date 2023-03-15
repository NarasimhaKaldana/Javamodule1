package oopsday4inheritance.composition;

public class Address {
          
	    private String doorNo;
	    private String buildingNo;
	    private String street;
	    private String city;
	    private long pin;
	    public Address() {

	    }
		public Address(String doorNo, String buildingNo, String street, String city, long pin) {
			super();
			this.doorNo = doorNo;
			this.buildingNo = buildingNo;
			this.street = street;
			this.city = city;
			this.pin = pin;
		}
		public String getDoorNo() {
			return doorNo;
		}
		public void setDoorNo(String doorNo) {
			this.doorNo = doorNo;
		}
		public String getBuildingNo() {
			return buildingNo;
		}
		public void setBuildingNo(String buildingNo) {
			this.buildingNo = buildingNo;
		}
		public String getStreet() {
			return street;
		}
		public void setStreet(String street) {
			this.street = street;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public long getPin() {
			return pin;
		}
		public void setPin(long pin) {
			this.pin = pin;
		}
	    
	    
	    
	    
	    
	    
	    }
