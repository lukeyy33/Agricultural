
import java.util.*;

/**
 * "Farm" basically is a "set of fields" because all fields are contained within a farm
 */
public class Farm {

    /**
     * Default constructor
     */
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
        
        return fields;
    }

    /**
     * @param int 
     * @return
     */
    public Field getFieldByNumber(int fieldNumber) {
        // TODO implement here
        return null;
    }

    /**
     * @param String 
     * @return
     */
    public Field getFieldByName(String fieldName) {
       for (Field f: fields) {
           if (f.getName().equals(fieldName)){
               return f;
           }
       }
    return null;
    }

    /**
     * params: crop, name, corners[]
     * 
     * corners[] is manually recorded by the farmer
     * @param String 
     * @param String 
     * @param Location array 
     * @return
     */
    public void addField(String crop, String name, Location corners[]) {
        // TODO implement here
    
    }

    /**
     * @param Field 
     * @return
     */
    public void removeField(Field number) {
        // TODO implement here
        
    }

    /**
     * params: name, location
     * @param String 
     * @param Location 
     * @return
     */
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