
import java.io.Serializable;
import java.util.*;

/**
 * Allows scalability i.e. if you're a large scale farm chain owner (like the
 * Co-op) you will have multiple farms that you own, or you can just have 1 farm
 * if you're e.g. an independent farmer
 *
 * SetOfFarms implements a vector (like SetOfBooks in the library example) thus
 * it doesn't need a "farms[]" array as that will be "super" inside the class
 */
public class SetOfFarms implements Serializable {

    private ArrayList<Farm> farms;

    /**
     *
     */
    public SetOfFarms() {
        farms = new ArrayList<Farm>();
    }

    /**
     *Add a farm that is already in the system
     * @param farm
     */
    public void addFarmAlreadyInSystem(Farm farm) {
        farms.add(farm);
    }

    /**
     *
     * @param name
     * @param location
     * @param id
     */
    public void addFarm(String name, Location location, int id) {
        Farm tmp = new Farm(name, location, id);
        farms.add(tmp);
    }

    /**
     *Returns Farm by specific farm name
     * @param farmName
     * @return
     */
    public Farm getFarmByName(String farmName) {
        for (int i = 0; i < farms.size(); i++) {
            if (farms.get(i).getName().equalsIgnoreCase(farmName)) {
                return farms.get(i);
            }
        }
        return null;
    }

    /**
     *Removes a farm
     * @param farm
     */
    public void removeFarm(Farm farm) {
        farms.remove(farm);
    }

    /**
     *Returns a farm by specific Farm Number
     * @param farmNumber
     * @return
     */
    public Farm getFarmByNumber(int farmNumber) {
        for (int i = 0; i < farms.size(); i++) {
            if (farms.get(i).getFarmNo() == farmNumber) {
                return farms.get(i);
            }
        }
        return null;
    }

    /**
     *
     * @return
     */
    public ArrayList<Farm> getAllFarms() {
        return this.farms;
    }

}
