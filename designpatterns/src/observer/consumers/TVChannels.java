package observer.consumers;

import observer.iface.WeatherObserver;

public class TVChannels implements WeatherObserver {
    
	@Override
	public void doUpdate(int temperature) {
		System.out.println("TV Channel updating temperature as "+temperature);
		
	}

}
