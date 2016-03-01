
import java.awt.Image;
import java.util.*;


public class SetOfFarmers {

    public SetOfFarmers() {
    }

    private Farmer[] farmers;
 

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
    
    public Farmer getFarmerByName(String farmerName) {
        for (Farmer f: farmers){
            if (f.getName().equals(farmerName))
                return f;
        }
        return null;
    }

    public Farmer getFarmerByEmail(String farmerEmail) {
       for (Farmer f: farmers){
            if (f.getEmail().equals(farmerEmail))
                return f;
        }
        return null;
    }


    public Farmer getFarmerByTelephone(String farmerTelephone) {
        for (Farmer f: farmers){
            if (f.getTelephone().equals(farmerTelephone))
                return f;
        }
        return null;
    }

    public Farmer[] getAllFarmers() {
        // TODO implement here
        return null;
    }

}