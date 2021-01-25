public class Main {

    public static void main(String[] args){
        SensorDevice meteoStation = new SensorDevice();
        new DisplayDevice("Basement", meteoStation);
        new DisplayDevice("Attic", meteoStation);

        meteoStation.setMeasurements(12, 78.5F);
        meteoStation.setMeasurements(10, 75.2F);
        meteoStation.setMeasurements(10, 75.5F);

    }

}
