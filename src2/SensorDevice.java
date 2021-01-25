import java.util.ArrayList;

public class SensorDevice implements Observable {

    private SensorData sensorData;
    private ArrayList<Observer> observers = new ArrayList<>();

    public void setMeasurements(SensorData sensorData) {
        this.sensorData = sensorData;
        this.notifyObservers();
    }

    public void registerObserver(Observer o) {
        this.observers.add(o);
    }

    public void deleteObserver(Observer o) {

        this.observers.remove(o);
    }

    public void notifyObservers() {
        for (Observer observer : this.observers)
            observer.update(this.sensorData);
    }

}
