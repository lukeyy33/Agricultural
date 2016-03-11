
import java.io.Serializable;
import java.util.*;

/**
 *
 * @author Dan
 */
public class Field implements Serializable {

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
    private Planting currentPlanting;
    // list of plantings, i.e. history
    private Planting[] plantings;

    /**
     *
     */
    public Field() {
    }

    /**
     *
     * @param name
     * @param type
     * @param fieldNo
     * @param cropName
     * @param cropArea
     */
    public Field(String name, String type, int fieldNo, String cropName, float cropArea) {
        this.name = name;
        this.type = type;
        this.fieldNo = fieldNo;
        this.crop = new Crop(cropName, cropArea);
        this.fieldStations = new FieldStation[0];
        this.plantings = new Planting[0];
    }

    /**
     * Returns fieldStation by name by iterating through the array looking for a
     * matching name
     *
     * @param fieldStationName
     * @return
     */
    public FieldStation getFieldStationByName(String fieldStationName) {
        FieldStation tmp = new FieldStation();
        for (int i = 0; i < fieldStations.length; i++) {
            if (fieldStations[i].getName().equalsIgnoreCase(fieldStationName)) {
                tmp = fieldStations[i];
            }
        }
        return tmp;
    }

    /**
     * Returns fieldStation by number by iterating through the array looking for
     * a matching number
     *
     * @param fieldStationNo
     * @return
     */
    public FieldStation getFieldStationByNumber(int fieldStationNo) {
        for (int i = 0; i < fieldStations.length; i++) {
            if (fieldStations[i].getFieldStationNo() == fieldStationNo) {
                return fieldStations[i];
            }
        }
        return null;
    }

    /**
     * Adds a field station with a Location and Name
     *
     * @param currentLocation
     * @param name
     */
    public void addFieldStation(Location currentLocation, String name, int id) {
        FieldStation tmp[] = new FieldStation[fieldStations.length + 1];
        for (int i = 0; i < fieldStations.length; i++) {
            tmp[i] = fieldStations[i];
        }
        tmp[fieldStations.length] = new FieldStation(name, currentLocation, id);
        fieldStations = tmp;
    }

    /**
     * Removes a field station by using a for loop to iterate through the array
     * to find the field station and remove it
     *
     * @param fieldStation
     */
    public void removeFieldStation(int fieldStation) {
        for (int i = 0; i < fieldStations.length; i++) {
            if (fieldStations[i].getFieldStationNo() == fieldStation) {
                for (int j = i; j < fieldStations.length - 1; j++) {
                    fieldStations[j] = fieldStations[j + 1];
                }
            }
        }
        FieldStation tmp[] = new FieldStation[fieldStations.length - 1];
        for (int i = 0; i < fieldStations.length - 1; i++) {
            tmp[i] = fieldStations[i];
        }
        fieldStations = tmp;
    }

    /**
     * Updates the field Info for Name, Type, fieldNo, cropName and cropArea
     *
     * @param name
     * @param type
     * @param fieldNo
     * @param cropName
     * @param cropArea
     */
    public void updateFieldInfo(String name, String type, int fieldNo, String cropName, float cropArea) {
        this.crop = new Crop(cropName, cropArea);
        this.name = name;
        this.type = type;
        this.fieldNo = fieldNo;
    }

    // calculates and returns the area of the field using its attributes
    /**
     * Returns the Area
     *
     * @return
     */
    public float getArea() {
        return crop.getAreaRequired();
    }

    /**
     * Return all fieldStations
     *
     * @return
     */
    public FieldStation[] getAllFieldStations() {
        return fieldStations;
    }

    /**
     * Returns Name
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * Returns Type
     *
     * @return
     */
    public String getType() {
        return type;
    }

    /**
     * Returns Crop
     *
     * @return
     */
    public Crop getCrop() {
        return crop;
    }

    /**
     * Return Plantings
     *
     * @return
     */
    public Planting[] getPlantings() {
        return plantings;
    }

    /**
     * Returns Field Number
     *
     * @return
     */
    public int getFieldNumber() {
        return this.fieldNo;
    }

    public boolean setCurrentPlanting(Date date) {
        if (currentPlanting == null) {
            currentPlanting = new Planting();
            currentPlanting.plant(crop, date);
            return true;
        } else {
            return false;
        }
    }

    public boolean harvestCurrentPlanting(Date date, int yield) {
        if (currentPlanting != null) {
            currentPlanting.harvest(date, yield);
            Planting[] tmp = new Planting[plantings.length + 1];
            
            for(int i = 0; i <plantings.length;i++){
                tmp[i]=plantings[i];
            }
            tmp[plantings.length] = currentPlanting;
            plantings = tmp;
            currentPlanting = null;
            return true;
        }else{
            return false;
        }
    }
    
    public Planting getCurrentPlanting(){
        return currentPlanting;
    }
}
