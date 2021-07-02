package mypackage;

import java.util.Observable;
import java.util.Observer;

public class StatisticsDisplay implements Observer, DisplayElement{
	private float temperature;
	private float humidity;
	Observable observable;
	
	public StatisticsDisplay( Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
	}
	public void update(Observable o, Object arg) {
		if(observable instanceof WeatherData)
		{
			WeatherData weatherData = (WeatherData)observable;
			temperature = weatherData.getTemperature();
			humidity = weatherData.getHumidity();
			display();
		}
	}

public void display() {
	System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
	}
}
