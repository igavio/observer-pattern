import java.util.ArrayList;

public class Observable {

    private ArrayList<Observer> observers = new ArrayList<>();

    public void registerObserver(Observer o) {
        this.observers.add(o);
    }

    public void deleteObserver(Observer o) {
        this.observers.remove(o);
    }

    public void notifyObservers(SensorData sensorData) {
        for (Observer observer : this.observers)
            observer.update(sensorData);
    }

}
