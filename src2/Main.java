public class Main {

    public static void main(String[] args){
        SensorDevice meteoStation = new SensorDevice();
        DisplayDevice masterDisplay = new DisplayDevice("Basement", meteoStation);
        DisplayDevice secondaryDisplay = new DisplayDevice("Attic", meteoStation);

        meteoStation.setMeasurements(new SensorData(12, 78.5F));
        meteoStation.setMeasurements(new SensorData(10, 75.2F));
    }

}
