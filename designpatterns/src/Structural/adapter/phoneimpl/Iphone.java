package Structural.adapter.phoneimpl;

import Structural.adapter.phoneifaces.LightningPhone;

public class Iphone implements LightningPhone {
	 private boolean connector;
	 
	 @Override
		public void useLightning() {
			 connector = true;
		        System.out.println("LightningPhone connected");
		}

	@Override
	public void recharge() {
		if(connector) {
       	 System.out.println("Recharge started");
       	 System.out.println("Recharge Finished");
        }
        else {
       	 System.out.println("Connect LightningPhone first");
        }
	}
	

	
}
