import java.util.*;

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
        arearequired = a;
        plantedtime = new Date();
    }

    private String name;
    private Date plantedtime;

    /**
     * for each individual plant in m^2
     */
    private float arearequired;

    /*     
     * @return 
     */   
    public String getName() {
        // TODO implement here
        return name;
    }

    /**
     * @return
     */
    /*public JTime getPlantedTime() {
        // TODO implement here
        return plantedtime;
    } */

    /**
     * @return
     */
    public float getAreaRequired() {
        // TODO implement here
        return arearequired;
    }

    /**
     * @param String 
     * @param JTime 
     * @param float 
     * @return
     */
    /*public void updateCropInfo(String, JTime, float) {
        // TODO implement here
        return null;
    } */

}