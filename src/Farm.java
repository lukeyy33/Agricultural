
import java.io.Serializable;
import java.util.*;

/**
 * "Farm" basically is a "set of fields" because all fields are contained within
 * a farm
 */
public class Farm implements Serializable{

    private Field[] fields;
    private String name;
    private int farmNo;
    private Location location;

    /**
     *
     */
    public Farm() {
    }

    /**
     *
     * @param name
     * @param location
     * @param farmNo
     */
    public Farm(String name, Location location, int farmNo) {
        this.name = name;
        this.location = location;
        this.farmNo = farmNo;
        fields = new Field[0];
    }

    /**
     *Returns all fields
     * @return
     */
    public Field[] getAllFields() {
        return this.fields;
    }

    /**
     *Uses a for loop to iterate through max length of fields and returns the matching field by number
     * @param fieldNumber
     * @return
     */
    public Field getFieldByNumber(int fieldNumber) {
        for (int i = 0; i < fields.length; i++) {
            if (fields[i].getFieldNumber() == fieldNumber) {
                return fields[i];
            }
        }
        return null;
    }

    /**
     *Uses a for loop to iterate through max length of fields and returns the matching field by name
     * @param fieldName
     * @return
     */
    public Field getFieldByName(String fieldName) {
        for (int i = 0; i < fields.length; i++) {
            if (fields[i].getName().equalsIgnoreCase(fieldName)) {
                return fields[i];
            }
        }
        return null;
    }

    /**
     *Adds a field onto the array
     * @param name
     * @param type
     * @param fieldNo
     * @param cropName
     * @param cropArea
     */
    public void addField(String name, String type, int fieldNo, String cropName, float cropArea) {
        Field tmp[] = new Field[fields.length + 1];
        for (int i = 0; i < fields.length; i++) {
            tmp[i] = fields[i];
        }
        tmp[fields.length] = new Field(name, type, fieldNo, cropName, cropArea);
        fields = tmp;
    }

    /**
     *Removes a field from the array
     * @param number
     */
    public void removeField(int number) {
        for (int i = 0; i < fields.length; i++) {
            if (fields[i].getFieldNumber() == number) {
                for (int j = i; j < fields.length - 1; j++) {
                    fields[j] = fields[j + 1];
                }
            }
        }
        Field tmp[] = new Field[fields.length - 1];
        for (int i = 0; i < fields.length - 1; i++) {
            tmp[i] = fields[i];
        }
        fields = tmp;
    }

    /**
     *Updates name, location and ID of farm
     * @param name
     * @param location
     * @param id
     */
    public void updateFarmInfo(String name, Location location, int id) {
        this.name = name;
        this.location = location;
        this.farmNo = id;
    }

    /**
     *Returns name
     * @return
     */
    public String getName() {
        return this.name;
    }

    /**
     *Returns farm number
     * @return
     */
    public int getFarmNo() {
        return this.farmNo;
    }

    /**
     *Returns Location
     * @return
     */
    public Location getLocation() {
        return this.location;
    }
}
