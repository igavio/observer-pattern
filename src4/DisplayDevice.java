public class DisplayDevice implements Observer {

    private final String displayName;
    private SensorDevice deviceObserved;
    private int temperature;
    private float humidity;

    public DisplayDevice(String displayName, SensorDevice deviceObserved) {
        this.displayName = displayName;
        this.deviceObserved = deviceObserved;
        deviceObserved.registerObserver(this);
    }

    public void update() {
        this.temperature = this.deviceObserved.getTemperature();
        this.humidity = this.deviceObserved.getHumidity();
        System.out.println(" Device:" + this.displayName +
                ", Display data: (" + this.temperature + ", " + this.humidity + ")");
    }

}
