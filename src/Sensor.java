
import java.io.Serializable;
import java.util.*;

/**
 * 'sensor' shouldn't store it's own data because what if you delete the sensor
 * and it hasn't recorded its data externally? all that data will be lost. plus
 * you will inevitably delete the sensor at some point anyway so you will have
 * to record the data elsewhere.
 *
 * sensor will need to implement Java's Runnable interface or something to
 * support parallelism since there will be multiple sensors all doing things
 * concurrently
 */
public class Sensor implements Serializable{

    //Because a sensor can be moved
    private Location currentLocation;
    //therefore sensor doesn't need to know the 'current time' etc., just needs to take readings every 'interval' ms   
    private int interval;
    //Unique identifier for this sensor (like accession number in library system), comes packaged on the sensor
    private int serialNo;
    //Alternative to deleting a sensor? Might want to turn it off temporarily? 
    private boolean active;
    private FieldStation parentFieldStation;

    public Sensor() {
        
    }
    public Sensor(Location location, int intervalIn, int serialNumber, FieldStation pFieldStation ) {
        currentLocation = location;
        interval = intervalIn;
        serialNo = serialNumber;
        parentFieldStation = pFieldStation;
        active = false;
    }

    public Location getCurrentLocation() {
        return currentLocation;
    
    }
    /**
     * Once a sensor is started this method is called by run(), a data object is
     * created, the data object will be appended to the parent fielsStation
     *
     * This method will be overriden by the sensor sub-classes which each have
     * specialised sensor reading interfaces
     *
     * @return
     */
    public void takeReading() {
    }

    public void setInterval(int intervalIn) {
        interval = intervalIn;
    }

    public void setCurrentLocation(Location location) {
        currentLocation = location;
    }

    /**
     * when executed, says: while (active), execute takeReading()
     *
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

    public FieldStation getParentFieldStation() {
        return parentFieldStation;
    }

    public int getSerialNo() {
        return serialNo;
    }

}
