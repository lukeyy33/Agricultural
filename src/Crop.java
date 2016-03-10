
import java.util.*;

public class Crop {

    private String name;
    private Date plantedTime;
    //for each individual plant in m^2
    private float areaRequired;

    public Crop() {
    }

    public Crop(String n, float a) {
        name = n;
        areaRequired = a;
        plantedTime = new Date();
    }

    public Crop(String n, float a, Date d) {
        name = n;
        areaRequired = a;
        plantedTime = d;
    }

    public String getName() {
        return this.name;
    }

    public Date getPlantedTime() {
        return this.plantedTime;
    }

    public float getAreaRequired() {
        return areaRequired;
    }

    public void updateCropInfo(String name, Date date, float areaRequired) {
        this.name = name;
        this.plantedTime = date;
        this.areaRequired = areaRequired;
    }

}
