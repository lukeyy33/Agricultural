
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

    public Farmer(String name, String email, String telephone, int id, /*Image picture*/ SetOfFarms farms) {
        this.name = name;
        this.email = email;
        this.id = id;
        this.telephone = telephone;
        this.associatedfarms = farms;
    }

    public SetOfFarms getAssociatedFarms() {
        return this.associatedfarms;
    }

    public void updateFarmerInfo(String name, String email, String telephone, int id,/*Image picture,*/SetOfFarms associatedfarms) {
        this.name = name;
        this.email = email;
        this.telephone = telephone;
        this.id = id;
        this.associatedfarms = associatedfarms;
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public String getTelephone() {
        return this.telephone;
    }

    public Image getPicture() {
        return null;
    }

    public int getId() {
        return id;
    }

}
