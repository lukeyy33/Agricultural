
import java.awt.Image;
import java.util.*;

public class SetOfFarmers {

    public SetOfFarmers() {
        farmers = new Farmer[0];
    }

    private Farmer[] farmers;

    public void addFarmer(String name, String email, String telephone, int id, /*Image image,*/ SetOfFarms farms) {
        Farmer tmp[] = new Farmer[farmers.length+1];
        for(int i = 0; i< farmers.length;i++){
            tmp[i] = farmers[i];
        }
        tmp[farmers.length] = new Farmer(name, email, telephone, id, farms);
        farmers = tmp;
    }

    public void removeFarmer(int id) {
        for (int i = 0; i < farmers.length; i++) {
            if (farmers[i].getId() == id) {
                for (int j = i; j < farmers.length-1; j++) {
                    farmers[j] = farmers[j + 1];
                }
            }
        }
        Farmer tmp[] = new Farmer[farmers.length-1];
        for(int i=0; i < farmers.length-1;i++){
            tmp[i] = farmers[i];
        }
        farmers = tmp;
    }

    public Farmer getFarmerByName(String farmerName) {
        for (Farmer f : farmers) {
            if (f.getName().equals(farmerName)) {
                return f;
            }
        }
        return null;
    }

    public Farmer getFarmerByEmail(String farmerEmail) {
        for (Farmer f : farmers) {
            if (f.getEmail().equals(farmerEmail)) {
                return f;
            }
        }
        return null;
    }

    public Farmer getFarmerByTelephone(String farmerTelephone) {
        for (Farmer f : farmers) {
            if (f.getTelephone().equals(farmerTelephone)) {
                return f;
            }
        }
        return null;
    }

    public Farmer[] getAllFarmers() {
        return this.farmers;
    }

}
