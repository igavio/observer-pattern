public class SensorDevice extends Observable {

    private final static float humidityThreshold = 1.0F;

    private int temperature;
    private float humidity;

    public int getTemperature() {
        return this.temperature;
    }

    public float getHumidity() {
        return this.humidity;
    }

    public void setMeasurements(int temperature, float humidity) {
        boolean sendUpdate = false;
        if ((Math.abs(this.humidity - humidity) >= humidityThreshold) ||
            (this.temperature != temperature))
            sendUpdate = true;
        this.temperature = temperature;
        this.humidity = humidity;
        if (sendUpdate)
            super.notifyObservers( );
    }

}
