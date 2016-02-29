
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

    /**
     * @return
     */
    public SetOfFarms getAssociatedFarms() {
        // TODO implement here
        return null;
    }

    /**
     * @param String 
     * @param String 
     * @param String 
     * @param Image 
     * @param SetOfFarms 
     * @return
     */
    
    public void updateFarmerInfo(String name,
            String email,
            String telephone,Image picture,
            SetOfFarms associatedfarms) {
        // TODO implement here
 
    } 

    /**
     * @return
     */
    public String getName() {
        // TODO implement here
        return "";
    }

    /**
     * @return
     */
    public String getEmail() {
        // TODO implement here
        return "";
    }

    /**
     * @return
     */
    public String getTelephone() {
        // TODO implement here
        return "";
    }

    /**
     * @return
     */
    public Image getPicture() {
        // TODO implement here
        return null;
    }

}