
import java.util.*;

public class Field {

    public Field() {
    }

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
        FieldStation tmp = new FieldStation();
        for (int i = 0; i < fieldStations.length; i++) {
            if (fieldStations[i].getName().equals(fieldStationName)) {
                tmp = fieldStations[i];
            }
        }
        return tmp;
    }

    public FieldStation getFieldStationByNumber(int fieldStationNo) {
        FieldStation tmp = new FieldStation();
        for (int i = 0; i < fieldStations.length; i++) {
            if (fieldStations[i].getFieldStationNo() == fieldStationNo) {
                tmp = fieldStations[i];
            }
        }
        return tmp;
    }

    public void addFieldStation(Location currentLocation, String name) {
        FieldStation[] tmp = new FieldStation[fieldStations.length+1];
        tmp[fieldStations.length] = new FieldStation(name, currentLocation);
        fieldStations = tmp;
    }

    public void removeFieldStation(FieldStation fieldStation) {
        for(int i = 0; i < fieldStations.length; i++){
            if(fieldStations[i] == fieldStation){
                for(int j = i; j < fieldStations.length; j++){
                    fieldStations[j] = fieldStations[j+1];
                }
            }
        }
        FieldStation tmp[] = new FieldStation[fieldStations.length-1];
        for(int i=0; i < fieldStations.length-1;i++){
            tmp[i] = fieldStations[i];
        }
        fieldStations = tmp;
    }

    public void updateFieldInfo(String crop, String name, float length, float height) {
        this.crop = new Crop(crop, length*height);
        this.name = name;
    }

    // calculates and returns the area of the field using its attributes
    public float getArea() {
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

    public void setPlantings(Planting[] plantings) {
        this.plantings = plantings;
    }

    public String getLatestPlanting() {
        return this.plantings[plantings.length - 1].toString();
    }

    public int getFieldNumber() {
        return this.fieldNo;
    }

}
