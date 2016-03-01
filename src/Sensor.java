
import java.util.*;

/**
 * 'sensor' shouldn't store it's own data because what if you delete the sensor and it hasn't recorded its data externally? all that data will be lost. plus you will inevitably delete the sensor at some point anyway so you will have to record the data elsewhere.
 * 
 * sensor will need to implement Java's Runnable interface or something to support parallelism since there will be multiple sensors all doing things concurrently
 */
public class Sensor {

    /**
     * Default constructor
     */
    public Sensor() {
    }

    /**
     * Because a sensor can be moved
     */
    private Location currentlocation;

    /**
     * therefore sensor doesn't need to know the 'current time' etc., just needs to take readings every 'interval' ms
     */
    private int interval;

    /**
     * Unique identifier for this sensor (like accession number in library system), comes packaged on the sensor
     */
    private int serialno;

    /**
     * Alternative to deleting a sensor? Might want to turn it off temporarily?
     */
    private boolean active;

    /**
     * 
     */
    private FieldStation parentfieldstation;

    /**
     * 
     */
    //public FieldStation 1;

    /**
     * 
     */
    //public Location 1;


    /**
     * 
     */
  //  public Location 1;

    /**
     * @return
     */
    public String getCurrentLocation() {
        // TODO implement here
        return "";
    }

    /**
     * Once a sensor is started this method is called by run(), a data object is created, the data object will be appended to the parent fielsStation
     * 
     * This method will be overriden by the sensor sub-classes  which each have specialised sensor reading interfaces
     * @return
     */
    
    public void takeReading() {
        // TODO implement here

        Data data = new Data();
        //FieldStation.appendNewData(data);
    }

    /**
     * @param int 
     * @return
     */
    public void setInterval(int interval) {
        // TODO implement here
    }

    /**
     * @param Location 
     * @return
     */
    public void setCurrentLocation(Location location) {
        // TODO implement here
   
    }

    /**
     * when executed, says:
     * while (active), 
     * execute takeReading()
     * @return
     */
    public void run() {
        while (active) {
            takeReading();
        }
    }
     
    public void stop() {
        active = false;
    }

    /**
     * @return
     */
    public FieldStation getParentFieldStation() {
        return  parentfieldstation;
    }

    /**
     * @return
     */
    public int getSerialNo() {
        return serialno;
    }

}