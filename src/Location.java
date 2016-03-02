import java.util.*;

public class Location {

    public Location( ) {
    }
   
    public Location(int x, int y, String t ) {
        this.xcoord = x;
        this.ycoord = y;
        this.type = t;
    }

    private float xcoord;
    private float ycoord;    
    //e.g. could be GPS coords, or could be metres relative to the size of the farm  
    private String type;
    public Farm farm;
    public FieldStation fieldStation;
    public Sensor sensor;
    public Data data;

    public float getXCoord() {
        // TODO implement here
        return 0.0f;
    }


    public float getYCoord() {
        // TODO implement here
        return 0.0f;
    }

    public String getType() {
        // TODO implement here
        return "";
    }

}