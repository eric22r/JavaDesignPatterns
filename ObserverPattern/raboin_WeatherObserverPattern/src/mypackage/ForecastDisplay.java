package mypackage;
import java.util.Observable;
import java.util.Observer;
public class ForecastDisplay implements Observer, DisplayElement{

	private float temperature;
	private float humidity;
	private float pressure;
	Observable observable;
	private float currentPressure = 29.92f;
	private float lastPressure;
	
	public ForecastDisplay(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
		
	}
	public void update(Observable o, Object arg) {
		if(observable instanceof WeatherData)
		{
			WeatherData weatherData = (WeatherData)observable;
			lastPressure = currentPressure;
			currentPressure = weatherData.getPressure();

			display();
		}
	}
	public void display() {
		System.out.println("Forecast: More of the same");
	}
}
