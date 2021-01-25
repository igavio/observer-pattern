public class SensorDevice extends Observable {

    private SensorData sensorData;

    public void setMeasurements(SensorData sensorData) {
        this.sensorData = sensorData;
        super.notifyObservers(sensorData);
    }

}
