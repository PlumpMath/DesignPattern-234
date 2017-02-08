package WeatherORama.Interfaces;

/**
 * Created by alama on 2/8/17.
 */
public interface Observer {
    public void update( float temp, float humidity, float pressure);
}
