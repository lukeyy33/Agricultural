
import java.io.Serializable;
import java.util.*;

/**
 *
 * @author Dan
 */
public class Crop implements Serializable{

    private String name;
    private Date plantedTime;
    //for each individual plant in m^2
    private float areaRequired;

    /**
     *
     */
    public Crop() {
    }

    /**
     *
     * @param n
     * @param a
     */
    public Crop(String n, float a) {
        name = n;
        areaRequired = a;
        plantedTime = new Date();
    }

    /**
     *
     * @param n
     * @param a
     * @param d
     */
    public Crop(String n, float a, Date d) {
        name = n;
        areaRequired = a;
        plantedTime = d;
    }

    /**
     *Return Name
     * @return
     */
    public String getName() {
        return this.name;
    }

    /**
     *Return PlantedTime
     * @return
     */
    public Date getPlantedTime() {
        return this.plantedTime;
    }

    /**
     *Return getAreaRequired
     * @return
     */
    public float getAreaRequired() {
        return areaRequired;
    }

    /**
     *Update Crop Info with Name, Date, Area Required
     * @param name
     * @param date
     * @param areaRequired
     */
    public void updateCropInfo(String name, Date date, float areaRequired) {
        this.name = name;
        this.plantedTime = date;
        this.areaRequired = areaRequired;
    }

}
