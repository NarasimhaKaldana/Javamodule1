package observer.main;

import observer.consumers.NewsPapers;
import observer.consumers.TVChannels;
import observer.subjectimpl.WeatherStation;

public class TestObserver {

	public static void main(String[] args) {

		
		
		
		TVChannels observer1 = new TVChannels(); // subscriber
		NewsPapers observer2 = new NewsPapers(); // subscriber
		TVChannels observer3 = new TVChannels();
	
		WeatherStation weatherStation = new WeatherStation(33);
		weatherStation.addObserver(observer1);
		weatherStation.addObserver(observer2);
		weatherStation.addObserver(observer3);

		weatherStation.setTemparature(30);

		// weatherStation.removeObserver(observer1);
	}

}
