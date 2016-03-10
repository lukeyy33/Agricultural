
import java.util.*;

/**
 * "Farm" basically is a "set of fields" because all fields are contained within
 * a farm
 */
public class Farm {

    private Field[] fields;
    private String name;
    private int farmNo;
    private Location location;

    public Farm() {
    }

    public Farm(String name, Location location, int farmNo) {
        this.name = name;
        this.location = location;
        this.farmNo = farmNo;
        fields = new Field[0];
    }

    public Field[] getAllFields() {
        return this.fields;
    }

    public Field getFieldByNumber(int fieldNumber) {
        for (int i = 0; i < fields.length; i++) {
            if (fields[i].getFieldNumber() == fieldNumber) {
                return fields[i];
            }
        }
        return null;
    }

    public Field getFieldByName(String fieldName) {
        for (int i = 0; i < fields.length; i++) {
            if (fields[i].getName().equalsIgnoreCase(fieldName)) {
                return fields[i];
            }
        }
        return null;
    }

    public void addField(String name, String type, int fieldNo, String cropName, float cropArea) {
        Field tmp[] = new Field[fields.length + 1];
        for (int i = 0; i < fields.length; i++) {
            tmp[i] = fields[i];
        }
        tmp[fields.length] = new Field(name, type, fieldNo, cropName, cropArea);
        fields = tmp;
    }

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

    public void updateFarmInfo(String name, Location location, int id) {
        this.name = name;
        this.location = location;
        this.farmNo = id;
    }

    public String getName() {
        return this.name;
    }

    public int getFarmNo() {
        return this.farmNo;
    }

    public Location getLocation() {
        return this.location;
    }
}
