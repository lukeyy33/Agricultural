
import java.util.*;

/**
 * Allows scalability i.e. if you're a large scale farm chain owner (like the Co-op) you will have multiple farms that you own, or you can just have 1 farm if you're e.g. an independent farmer
 * 
 * SetOfFarms implements a vector (like SetOfBooks in the library example) thus it doesn't need a "farms[]" array as that will be "super" inside the class
 */
public class SetOfFarms {

    /**
     * Default constructor
     */
    public SetOfFarms() {
        farms = new ArrayList<Farm>();
    }


    private ArrayList<Farm> farms;


    public void addFarm(String name, Location location) {
        farms.add(new Farm(name, location));
    }

 
    public Farm getFarmByName(String farmName) {
        for(int i = 0; i < farms.size(); i++){
            if(farms.get(i).getName().equalsIgnoreCase(farmName)){
                return farms.get(i);
            }
        }
        return null;
    }

   
    public void removeFarm(Farm farm) {
        // TODO implement here
    }

   
    public Farm getFarmByNumber(int farmNumber) {
        // TODO implement here
        return farms.get(farmNumber);
    }


    public ArrayList<Farm> getAllFarms() {
        // TODO implement here
        return farms;
    }

}