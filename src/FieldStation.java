
import java.util.*;

/**
 * - has multiple sensors
 * - collects data from sensors
 * - stores data from sensors
 * - can be moved within a field (hence currentlocation)
 */
public class FieldStation {

    /**
     * Default constructor
     */
    public FieldStation() {
    }

    /**
     * 
     */
    private Location currentlocation;

    /**
     * e.g. [s1] [s2]
     */
    private Sensor[] sensors;

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
     * Looking at a list of numbers for field stations probably isn't very helpful (especially if there are a lot of them), so a name helps to differentiate it
     */
    private String name = "field 1";

    /**
     * 
     */
    private int fieldstationno;

    /**
     * 
     */
    private ConnectionHandler handler;


    /**
     * params: startTime, endTime, sensorTypes[], cropTypes[]
     * 
     * If any of these params are null (or empty), then inside the function they will have default values assumed
     * 
     * Then at the end once everything has a user-specified or default value, the data[] array is queried to return all data that matches these variables
     * @param JTime 
     * @param JTime 
     * @param int[] 
     * @param Crop[] 
     * @return
     */
   /* public Data[] getFieldStationData(JTime startTime, JTime endTime, int[] sensorTypes, Crop[] cropTypes) {
        // TODO implement here
        return null;
    }*/

    /**
     * params: sensor type, interval, active
     * @param int 
     * @param int 
     * @param boolean 
     * @return
     */
    public void addSensor(int sensorType, int interval, boolean active) {
        // TODO implement here
    }

    /**
     * Does NOT remove the type of sensor from sensortypes
     * @param Sensor 
     * @return
     */
    public void removeSensor(Sensor sensorTypes) {
        // TODO implement here
    }

    /**
     * @param int 
     * @return
     */
    public Sensor getSensorByNumber(int sensorNumber) {
        // TODO implement here
        return null;
    }

    /**
     * params: name, currentlocation
     * @param String 
     * @param String 
     * @return
     */
    public void updateFieldStationInfo(String name, String currentLocation) {
        // TODO implement here
    }

    /**
     * The FieldStation passes its location (from its on board GPS) to this method, and stores it in the currentlocation parameter
     * @param Location 
     * @return
     */
    public void initialize(Location currentLocation) {
        // TODO implement here
    }

    /**
     * calls takeReading() from all of its sensors (i.e. to force a reading NOW instead of waiting for the next interval)
     * 
     * param is enum sensor type i.e. only get readings of THIS sensor type, if not specified then get all
     * @param int 
     * @return
     */
    public void takeReadings(int readings) {
        // TODO implement here
    }

    /**
     * @param Data 
     * @return
     */
    public String appendNewData(Data data) {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public Sensor[] getAllSensors() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public String getName() {
        // TODO implement here
        return name;
    }

    /**
     * @return
     */
    public int getFieldStationNo() {
        // TODO implement here
        return 0;
    }

}