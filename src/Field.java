
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
    }

    /**
     *Returns fieldStation by name by iterating through the array looking for a matching name
     * @param fieldStationName
     * @return
     */
    public FieldStation getFieldStationByName(String fieldStationName) {
        FieldStation tmp = new FieldStation();
        for (int i = 0; i < fieldStations.length; i++) {
            if (fieldStations[i].getName().equals(fieldStationName)) {
                tmp = fieldStations[i];
            }
        }
        return tmp;
    }

    /**
     *Returns fieldStation by number by iterating through the array looking for a matching number
     * @param fieldStationNo
     * @return
     */
    public FieldStation getFieldStationByNumber(int fieldStationNo) {
        FieldStation tmp = new FieldStation();
        for (int i = 0; i < fieldStations.length; i++) {
            if (fieldStations[i].getFieldStationNo() == fieldStationNo) {
                tmp = fieldStations[i];
            }
        }
        return tmp;
    }

    /**
     *Adds a field station with a Location and Name
     * @param currentLocation
     * @param name
     */
    public void addFieldStation(Location currentLocation, String name) {
        FieldStation tmp[] = new FieldStation[fieldStations.length + 1];
        for (int i = 0; i < fieldStations.length; i++) {
            tmp[i] = fieldStations[i];
        }
        tmp[fieldStations.length] = new FieldStation(name, currentLocation);
        fieldStations = tmp;
    }

    /**
     *Removes a field station by using a for loop to iterate through the array to find the field station and remove it
     * @param fieldStation
     */
    public void removeFieldStation(FieldStation fieldStation) {
        for (int i = 0; i < fieldStations.length; i++) {
            if (fieldStations[i] == fieldStation) {
                for (int j = i; j < fieldStations.length; j++) {
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
     *Updates the field Info for Name, Type, fieldNo, cropName and cropArea
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
     *Returns the Area
     * @return
     */
    public float getArea() {
        return 0.0f;
    }

    /**
     *Return all fieldStations
     * @return
     */
    public FieldStation[] getAllFieldStations() {
        return fieldStations;
    }

    /**
     *Returns Name
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *Returns Type
     * @return
     */
    public String getType() {
        return type;
    }

    /**
     *Returns Crop
     * @return
     */
    public Crop getCrop() {
        return crop;
    }

    /**
     *Return Plantings
     * @return
     */
    public Planting[] getPlantings() {
        return plantings;
    }

    /**
     *Set Plantings
     * @param plantings
     */
    public void setPlantings(Planting[] plantings) {
        this.plantings = plantings;
    }

    /**
     *Return Latest Planting
     * @return
     */
    public String getLatestPlanting() {
        return this.plantings[plantings.length - 1].toString();
    }

    /**
     *Returns Field Number
     * @return
     */
    public int getFieldNumber() {
        return this.fieldNo;
    }

}
