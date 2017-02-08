package WeatherORama.DisplayElements;

import WeatherORama.Interfaces.Observer;
import WeatherORama.Interfaces.DisplayElement;
import WeatherORama.Interfaces.Subject;

/**
 * Created by alama on 2/8/17.
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;

        display();
    }

    public void display() {
        System.out.println("Current conditions: "+ temperature
                + "F degrees and " + humidity + "% humidity");
    }
}
