public class Main {

    public static void main(String[] args){

        SensorDevice meteoStation = new SensorDevice();
        DisplayDevice masterDisplay = new DisplayDevice("Basement");
        DisplayDevice secondaryDisplay = new DisplayDevice("Attic");

        SensorData reading1 = new SensorData(12, 78.5F);
        meteoStation.setMeasurements(reading1);
        masterDisplay.update(reading1);
        secondaryDisplay.update(reading1);

        SensorData reading2 = new SensorData(10, 75.2F);
        meteoStation.setMeasurements(reading2);
        masterDisplay.update(reading2);
        secondaryDisplay.update(reading2);
    }

}
