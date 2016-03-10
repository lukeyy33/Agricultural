
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * i.e. a certain crop was planted in this field at a certain time - how did it
 * do? what were the "parameters"?
 *
 * so in 1999, I planted wheat, then in 2000 I planted corn
 */
public class Planting {

    private Crop crop;
    private Date plantDate;
    private Date harvestDate;
    private int yield;

    /**
     *
     */
    public Planting() {
    }

    /**
     *
     * @param crop
     * @param plantDate
     * @param harvestDate
     * @param yield
     */
    public Planting(Crop crop, Date plantDate, Date harvestDate, int yield) {
        this.crop = crop;
        this.plantDate = plantDate;
        this.harvestDate = harvestDate;
        this.yield = yield;
    }

    public String toString() {
        // TODO implement here
        DateFormat df = new SimpleDateFormat("MM/dd/yyyy");

        String summary = getCropName() + " Harvested: " + "\n"
                + df.format(getHarvestDate()) + " Planted: " + "\n"
                + df.format(getPlantDate()) + " Yield: " + "\n"
                + getYield() + " kg";

        return summary;
    }

    /**
     *Returns Crop Name
     * @return
     */
    public String getCropName() {
        return crop.getName();
    }

    /**
     *Returns Plant Date
     * @return
     */
    public Date getPlantDate() {
        return plantDate;
    }

    /**
     *Returns Harvest Date
     * @return
     */
    public Date getHarvestDate() {
        return harvestDate;
    }

    /**
     *Returns Yield
     * @return
     */
    public int getYield() {
        return yield;
    }
}
