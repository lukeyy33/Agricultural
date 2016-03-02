import java.util.*;

public class Crop {

    public Crop() {
    }
    private String name;
    private Date plantedTime;
    //for each individual plant in m^2
    private float areaRequired;

    public Crop(String n, float a){
        name = n;
        areaRequired = a;
        plantedTime = new Date();
    }
    public Crop(String n, float a, Date d){
        name = n;
        areaRequired = a;
        plantedTime = d;
    }

    public String getName() {
        // TODO implement here
        return this.name;
    }

    public Date getPlantedTime() {
        // TODO implement here
        return this.plantedTime;
    }

    public float getAreaRequired() {
        // TODO implement here
        return areaRequired;
    }

    public void updateCropInfo(String name, Date date, float areaRequired) {
        // TODO implement here
        
    }

}