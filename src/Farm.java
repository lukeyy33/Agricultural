
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
        Field tmp[] = new Field[fields.length+1];
        tmp[fields.length] = new Field(name, type, fieldNo, cropName, cropArea);
        fields = tmp;
    }

    public void removeField(int number) {
        for (int i = 0; i <fields.length; i++) {
            if (fields[i].getFieldNumber() == number) {
                for(int j = i; j < fields.length; j++){
                    fields[j] = fields[j+1];
                }
            }
        }
        Field tmp[] = new Field[fields.length-1];
        for(int i=0; i < fields.length-1;i++){
            tmp[i] = fields[i];
        }
        fields = tmp;
    }

    public void updateFarmInfo(String name, Location location) {
        this.name = name;
        this.location = location;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setFields(Field[] fs) {
        this.fields = fs;
    }
    
    public int getFarmNo(){
        return this.farmNo;
    }


}