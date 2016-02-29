
import java.awt.Image;
import java.util.*;

/**
 * 
 */
public class SetOfFarmers {

    /**
     * Default constructor
     */
    public SetOfFarmers() {
    }

    /**
     * 
     */
    private Farmer[] farmers;


    /**
     * @param String 
     * @param String 
     * @param String 
     * @param Image 
     * @param SetOfFarms 
     * @return
     */
    public void addFarmer(String farmerName, String farmerEmail, 
            String farmerTelephone, Image image, SetOfFarms setOfFarms) {
        // TODO implement here
    }

    /**
     * @return
     */
    public void removeFarmer() {
        // TODO implement here
    }

    /**
     * @param String 
     * @return
     */
    public Farmer getFarmerByName(String farmerName) {
        for (Farmer f: farmers){
            if (f.getName().equals(farmerName))
                return f;
        }
        return null;
    }

    /**
     * @param String 
     * @return
     */
    public Farmer getFarmerByEmail(String farmerEmail) {
        // TODO implement here
        return null;
    }

    /**
     * @param String 
     * @return
     */
    public Farmer getFarmerByTelephone(String farmerTelephone) {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public Farmer[] getAllFarmers() {
        // TODO implement here
        return null;
    }

}