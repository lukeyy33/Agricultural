import java.util.*;
import java.util.Date;

/**
 * current crop in this field
 */
public class Crop {

    /**
     * Default constructor
     */
    public Crop() {
    }

    public Crop(String n, float a){
        name = n;
        areaRequired = a;
        plantedTime = new Date();
    }

    private String name;
    private Date plantedTime;

    /**
     * for each individual plant in m^2
     */
    private float areaRequired;
 
    public String getName() {
        // TODO implement here
        return name;
    }


    public Date getPlantedTime() {
        // TODO implement here
        return plantedTime;
    } 


    public float getAreaRequired() {
        // TODO implement here
        return areaRequired;
    }

    /**
     * @param String 
     * @param JTime 
     * @param float 
     * @return
     */
    public void updateCropInfo(String name, Date date, float areaRequired) {
        // TODO implement here
        
    }

}