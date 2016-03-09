
import java.util.*;

/**
 * - has multiple sensors
 * - collects data from sensors
 * - stores data from sensors
 * - can be moved within a field (hence currentlocation)
 */
public class FieldStation {

    public FieldStation() {
    }
    
    public FieldStation(String nameIn, Location location) {
        currentLocation = location;
        name = nameIn;
    }
    
    private Location currentLocation;
    private Sensor[] sensors;
    //Looking at a list of numbers for field stations probably isn't very helpful (especially if there are a lot of them), so a name helps to differentiate it
    private String name;
    private int fieldstationNo; 
    private ConnectionHandler handler;
    /**
     * Stores ALL the data from every sensor, then you can differentiate by saying "only get data from sensors of type x" or "at time x" "location x" etc.
     * 
     * e.g. [d1] [d2]...
     * each contains something like:
     * 48.7
     * 10:00
     * 1
     * "here"(?)
     * "cm/3"
     */
    private Data[] data;

    /**
     * params: startTime, endTime, sensorTypes[], cropTypes[]
     * If any of these params are null (or empty), then inside the function they will have default values assumed
     * Then at the end once everything has a user-specified or default value, the data[] array is queried to return all data that matches these variables
     */
    public Data[] getFieldStationData(Date startTime, Date endTime, int[] sensorTypes, Crop[] cropTypes) {
        // TODO implement here
        return data;
    }

    public void addSensor(int sensorType, int interval, boolean active) {
        // TODO implement here
    }

    //Does NOT remove the type of sensor from sensortypes
    public void removeSensor(Sensor sensorTypes) {
        // TODO implement here
        
    }

    public Sensor getSensorByNumber(int sensorNumber) {
        // TODO implement here
        return this.getSensorByNumber(sensorNumber);
    }

    public void updateFieldStationInfo(String name, String currentLocation) {
        // TODO implement here
    }

    //The FieldStation passes its location (from its on board GPS) to this method, and stores it in the currentlocation parameter
    public void initialize(Location currentLocation) {
        // TODO implement here
    }

    //calls takeReading() from all of its sensors (i.e. to force a reading NOW instead of waiting for the next interval)
    public void takeReadings(int readings) {
        // TODO implement here
    }

    public String appendNewData(Data data) {
        // TODO implement here
        return null;
    }

    public Sensor[] getAllSensors() {
        // TODO implement here
        return null;
    }

    public String getName() {
        return this.name;
    }

    public int getFieldStationNo() {
        return this.fieldstationNo;
    }

}