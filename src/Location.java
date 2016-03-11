
import java.io.Serializable;
import java.util.*;

/**
 *
 * @author Dan
 */
public class Location implements Serializable{

    private float xcoord;
    private float ycoord;
    private String type;

    /**
     *
     */
    public Location() {
    }

    /**
     *
     * @param x
     * @param y
     * @param t
     */
    public Location(float x, float y, String t) {
        this.xcoord = x;
        this.ycoord = y;
        this.type = t;
    }

    /**
     *Returns x coordinate
     * @return
     */
    public float getXCoord() {
        return xcoord;
    }

    /**
     *Returns Y coordinate
     * @return
     */
    public float getYCoord() {
        return ycoord;
    }

    /**
     *returns Type
     * @return
     */
    public String getType() {
        return type;
    }

}
