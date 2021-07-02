package mypackage;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
	private float temperature;
	private float humidity;
	private float minTemp;
	private float maxTemp;
	private float avgTemp;

	Observable observable;
	
	public CurrentConditionsDisplay( Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
	}
	public void update(Observable obs, Object arg) {
		if(obs instanceof WeatherData) {
			WeatherData weatherData = (WeatherData)obs;
			this.temperature = weatherData.getTemperature();
			this.humidity = weatherData.getHumidity();
			if(temperature < minTemp) minTemp = temperature;
			if (temperature > maxTemp) maxTemp = temperature;
			avgTemp = (avgTemp + temperature) / 2;

			display();
		}

	}
	public void display() {
		System.out.println("Avg/Max/Min temperature = "+ minTemp + "/" + maxTemp + "/" + avgTemp);
	}
}
