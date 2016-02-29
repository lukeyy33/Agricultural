
import java.util.*;

/**
 * 
 */
public class Location {

    /**
     * Default constructor
     */
    public Location( ) {
    }
   
    public Location(int x, int y, String t ) {
        this.xcoord = x;
        this.ycoord = y;
        this.type = t;
    }
    /**
     * 
     */
    private float xcoord;

    /**
     * 
     */
    private float ycoord;

    /**
     * e.g. could be GPS coords, or could be metres relative to the size of the farm
     */
    private String type;

    /**
     * 
     */
    //public Farm 1;

    /**
     * 
     */
    //public FieldStation 1;

    /**
     * 
     */
    //public Sensor 1;

    /**
     * 
     */
    //public Data 1;

    /**
     * @return
     */
    public float getXCoord() {
        // TODO implement here
        return 0.0f;
    }

    /**
     * @return
     */
    public float getYCoord() {
        // TODO implement here
        return 0.0f;
    }

    /**
     * @return
     */
    public String getType() {
        // TODO implement here
        return "";
    }

}