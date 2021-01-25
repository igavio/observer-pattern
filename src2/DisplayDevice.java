public class DisplayDevice implements Observer {

    private final String displayName;
    private SensorData displayData;

    public DisplayDevice(String displayName, SensorDevice sensorDevice) {
        this.displayName = displayName;
        this.displayData = null;
        sensorDevice.registerObserver(this);
    }

    public void update(SensorData sensorData) {
        this.displayData = sensorData;
        System.out.println(" Device:" + this.displayName +
                ", Display data:" + this.displayData);
    }

}
