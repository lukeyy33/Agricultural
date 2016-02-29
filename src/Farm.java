import java.util.*;

/**
 * "Farm" basically is a "set of fields" because all fields are contained within a farm
 */
public class Farm {

    public Farm() {
    }
    
    public Farm(String name, Location location, int farmNo) {
        this.name = name;
        this.location = location;
        this.farmNo = farmNo;
    }

    private Field[] fields;
    private String name;
    private int farmNo;
    private Location location;

    public Field[] getAllFields() {
        return fields;
    }


    public Field getFieldByNumber(int fieldNumber) {
        // TODO implement here
        return null;
    }

    public Field getFieldByName(String fieldName) {
        // TODO implement here
        return null;
    }

    public void addField(String crop, String name, Location corners[]) {
        // TODO implement here
    
    }

    public void removeField(Field number) {
        // TODO implement here
        
    }

    public void updateFarmInfo(String name, Location location) {
        // TODO implement here
   
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setFields(Field[] fs) {
        this.fields = fs;
    }


}