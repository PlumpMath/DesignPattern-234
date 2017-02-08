package WeatherORama.Interfaces;

/**
 * Created by alama on 2/8/17.
 */
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
