public class SensorData {

    private int temperature;
    private float humidity;

    public SensorData(int temperature, float humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
    }

    public String toString() {
        return "(Temperature:" + this.temperature +
                ", Humidity:" + this.humidity +")";
    }

}
