import java.awt.Image;
import java.util.*;

/**
 * so that farmers can be contacted by e.g. supermarket people who say "we're going to use your field at 2AM tomorrow"
 */
public class Farmer {

    /**
     * Default constructor
     */
    public Farmer() {
    }

    private String name;
    private String email;
    private String telephone;
    private Image picture;
    private SetOfFarms associatedfarms;

    public SetOfFarms getAssociatedFarms() {
        // TODO implement here
        return this.associatedfarms;
    }
    
    public void updateFarmerInfo(String name,
            String email,
            String telephone,Image picture,
            SetOfFarms associatedfarms) {
        // TODO implement here
 
    } 

    public String getName() {
       return this.name;
    }


    public String getEmail() {
        // TODO implement here
        return this.email;
    }


    public String getTelephone() {
        // TODO implement here
        return this.telephone;
    }

    public Image getPicture() {
        // TODO implement here
        return null;
    }

}