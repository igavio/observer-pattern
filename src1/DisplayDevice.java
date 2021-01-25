public class DisplayDevice {

    private final String displayName;
    private SensorData displayData;

    public DisplayDevice(String displayName) {
        this.displayName = displayName;
        this.displayData = null;
    }

    public void update(SensorData sensorData) {
        this.displayData = sensorData;
        System.out.println(" Device:" + this.displayName +
                ", Display data:" + this.displayData);
    }

}
