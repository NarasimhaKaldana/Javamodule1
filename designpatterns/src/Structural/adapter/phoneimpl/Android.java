package Structural.adapter.phoneimpl;

import Structural.adapter.phoneifaces.MicroUsbPhone;

public class Android implements MicroUsbPhone {
    private boolean connector;
    
    @Override
	public void useMicroUsb() {
        connector = true;
        System.out.println("MicroUsb connected");
	}
	@Override
	public void recharge() {
         if(connector) {
        	 System.out.println("Recharge started");
        	 System.out.println("Recharge Finished");
         }
         else {
        	 System.out.println("Connect MicroUsb first");
         }
	}

	

}
