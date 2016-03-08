
import java.util.*;

/**
 * "Farm" basically is a "set of fields" because all fields are contained within a farm
 */
public class Farm {


    public Farm() {
    }
    
    public Farm(String name, Location location) {
        this.name = name;
        this.location = location;
    }
    
    private Field[] fields;
    private String name;
    private int farmNo;
    private Location location;
    
    public Field[] getAllFields() {   
        return this.fields;
    }

    public Field getFieldByNumber(int fieldNumber) {
      return this.getFieldByNumber(fieldNumber);
    }


    public Field getFieldByName(String fieldName) {
       for (Field f: fields) {
           if (f.getName().equals(fieldName)){
               return f;
           }
       }
    return null;
    }

    public void addField(String name, String type, int fieldNo, String cropName, float cropArea, Location corners[]) {
        // TODO implement here 
        fields[this.fields.length+1] = new Field(name, type, fieldNo, cropName, cropArea);
    }

    public void removeField(Field number) {
        // TODO implement here
        for (int i = 0; i <fields.length; i++) {
            if (fields[i].getFieldStationByNumber(number)) {
                
            }
        }
        
        
    }

    public void updateFarmInfo(String name, Location location) {
        // TODO implement here
        //return null;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setFields(Field[] fs) {
        this.fields = fs;
    }


}