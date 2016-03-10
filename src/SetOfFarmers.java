
import java.awt.Image;
import java.io.Serializable;
import java.util.*;

/**
 *
 * @author Dan
 */
public class SetOfFarmers implements Serializable {

    private Farmer[] farmers;

    /**
     *
     */
    public SetOfFarmers() {
        farmers = new Farmer[0];
    }

    /**
     *
     * @param name
     * @param email
     * @param telephone
     * @param id
     * @param farms
     */
    public void addFarmer(String name, String email, String telephone, int id, /*Image image,*/ SetOfFarms farms) {
        Farmer tmp[] = new Farmer[farmers.length + 1];
        for (int i = 0; i < farmers.length; i++) {
            tmp[i] = farmers[i];
        }
        tmp[farmers.length] = new Farmer(name, email, telephone, id, farms);
        farmers = tmp;
    }

    /**
     *Removes Farmer via ID, iterates through a for loop to find exact match
     * @param id
     */
    public void removeFarmer(int id) {
        for (int i = 0; i < farmers.length; i++) {
            if (farmers[i].getId() == id) {
                for (int j = i; j < farmers.length - 1; j++) {
                    farmers[j] = farmers[j + 1];
                }
            }
        }
        Farmer tmp[] = new Farmer[farmers.length - 1];
        for (int i = 0; i < farmers.length - 1; i++) {
            tmp[i] = farmers[i];
        }
        farmers = tmp;
    }

    /**
     *Returns Farmer by specific Name
     * @param farmerName
     * @return
     */
    public Farmer getFarmerByName(String farmerName) {
        for (Farmer f : farmers) {
            if (f.getName().equalsIgnoreCase(farmerName)) {
                return f;
            }
        }
        return null;
    }

    /**
     *Returns Farmer by specific farmerID
     * @param farmerID
     * @return
     */
    public Farmer getFarmerByNumber(int farmerID) {
        for (Farmer f : farmers) {
            if (f.getId() == farmerID) {
                return f;
            }
        }
        return null;
    }

    /**
     *Returns Farmer by FarmerEmail
     * @param farmerEmail
     * @return
     */
    public Farmer getFarmerByEmail(String farmerEmail) {
        for (Farmer f : farmers) {
            if (f.getEmail().equalsIgnoreCase(farmerEmail)) {
                return f;
            }
        }
        return null;
    }

    /**
     *Returns Farmer by specific Telephone
     * @param farmerTelephone
     * @return
     */
    public Farmer getFarmerByTelephone(String farmerTelephone) {
        for (Farmer f : farmers) {
            if (f.getTelephone().equalsIgnoreCase(farmerTelephone)) {
                return f;
            }
        }
        return null;
    }

    /**
     *Returns all Farmers
     * @return
     */
    public Farmer[] getAllFarmers() {
        return this.farmers;
    }

}
