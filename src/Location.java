
import java.io.Serializable;
import java.util.*;

public class Location implements Serializable{

    private float xcoord;
    private float ycoord;
    private String type;

    public Location() {
    }

    public Location(int x, int y, String t) {
        this.xcoord = x;
        this.ycoord = y;
        this.type = t;
    }

    public float getXCoord() {
        return xcoord;
    }

    public float getYCoord() {
        return ycoord;
    }

    public String getType() {
        return type;
    }

}
