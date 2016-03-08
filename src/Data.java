import java.util.*;

/**
 * The actual recording from a sensor. Having time and sensorNo allows you to uniquely identify a particular 'data', so you can then say: "get me this sensor's reading at this time"
 * Sensor is NOT an attribute of Data because if you have a reference to the sensor inside Data and then the sensor is removed, the reference will point to null and won't give you any information
 */
public class Data {
    public Data() {
    }
    
    //The actual reading from the sensor   
    private float reading;
    //The time at which the reading was taken
    private Date time;
    //Allows you to keep track of which sensor this data came from (for search purposes?)
    private int sensorNo;
    //The location at which the reading was taken (because sensors can be moved)
    private Location readingLocation;
    
    private String name;

    //returns data in this format: name, number, time, location, reading (or some variant of this order)
    @Override
    public String toString() {
        return (name + sensorNo + time + readingLocation + reading);
    }

}