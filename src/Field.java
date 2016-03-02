import java.util.*;

public class Field {

    public Field() {}
    
    public Field(String name, String type, int fieldNo, String cropName, float cropArea) {
        this.name = name;
        this.type = type;
        this.fieldNo = fieldNo;
        this.crop = new Crop(cropName, cropArea);
    }

    private FieldStation[] fieldStations;
    private String name;
    private int fieldNo;
    // A GPS location that will represent each 'corner' (e.g. there may be more than 4) 
    // of the field, the corners will have been defined by the farmer manually walking around the field and taking GPS locations at every corner
    private Location[] corners;
    // e.g. outdoor field, greenhouse (may need attributes like has sprinklers?)
    private String type;
    // assuming 1 field only has 1 crop in it
    private Crop crop;  
   // list of plantings, i.e. history
    private Planting[] plantings;
 
    public FieldStation getFieldStationByName(String fieldStationName) {
        // TODO implement here
        return getFieldStationByName(fieldStationName);
    }

    public FieldStation getFieldStationByNumber(int fieldStationNo) {
        // TODO implement here
        return this.getFieldStationByNumber(fieldStationNo);
    }

    public void addFieldStation(String currentLocation, String name) {
        // TODO implement here
        
      
    }

    public void removeFieldStation(FieldStation fieldStation) {
        // TODO implement here
    }


    public void updateFieldInfo(String crop, String name, float length, float height) {
        // TODO implement here
    }

    // calculates and returns the area of the field using its attributes
    public float getArea() {
        // TODO implement here
        return 0.0f;
    }


    public FieldStation[] getAllFieldStations() {
        return this.fieldStations;
    }

    public String getName() {
        return this.name;
    }


    public String getType() {
        return this.type;
    }

    public Crop getCrop() {
        return this.crop;
    }

    public Planting[] getPlantings() {
        return this.plantings;
    }
    
    public void setPlantings(Planting[] plantings){
        this.plantings = plantings;
    }
    
    public String getLatestPlanting(){
        return this.plantings[plantings.length -1].toString();
    }

}