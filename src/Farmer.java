
import java.awt.Image;
import java.io.Serializable;
import java.util.*;

/**
 * so that farmers can be contacted by e.g. supermarket people who say "we're
 * going to use your field at 2AM tomorrow"
 */
public class Farmer implements Serializable {

    private String name;
    private String email;
    private String telephone;
    private Image picture;
    private int id;
    private SetOfFarms associatedfarms;

    /**
     * Default constructor
     */
    public Farmer() {
    }

    /**
     *
     * @param name
     * @param email
     * @param telephone
     * @param id
     * @param farms
     */
    public Farmer(String name, String email, String telephone, int id, /*Image picture*/ SetOfFarms farms) {
        this.name = name;
        this.email = email;
        this.id = id;
        this.telephone = telephone;
        this.associatedfarms = farms;
    }

    /**
     *Returns associated Farms
     * @return
     */
    public SetOfFarms getAssociatedFarms() {
        return this.associatedfarms;
    }

    /**
     *
     * @param name
     * @param email
     * @param telephone
     * @param id
     * @param associatedfarms
     */
    public void updateFarmerInfo(String name, String email, String telephone, int id,/*Image picture,*/SetOfFarms associatedfarms) {
        this.name = name;
        this.email = email;
        this.telephone = telephone;
        this.id = id;
        this.associatedfarms = associatedfarms;
    }

    /**
     *Returns Name
     * @return
     */
    public String getName() {
        return this.name;
    }

    /**
     *Returns Email
     * @return
     */
    public String getEmail() {
        return this.email;
    }

    /**
     *Returns Telephone
     * @return
     */
    public String getTelephone() {
        return this.telephone;
    }

    /**
     *
     * @return
     */
    public Image getPicture() {
        return null;
    }

    /**
     *Returns ID
     * @return
     */
    public int getId() {
        return id;
    }

}
