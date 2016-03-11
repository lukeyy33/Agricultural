
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
    public void plant(Crop cropIn, Date plantDateIn) {
        crop = cropIn;
        plantDate = plantDateIn;
        harvestDate = null;
        yield = 0;
    }

    public void harvest(Date harvestDateIn, int yieldIn) {
        harvestDate = harvestDateIn;
        yield = yieldIn;
    }
    @Override
    public String toString() {
        // TODO implement here
        DateFormat df = new SimpleDateFormat("MM/dd/yyyy");

        String summary = crop.getName() + " Harvested: " + "\n"
                + df.format(harvestDate) + " Planted: " + "\n"
                + df.format(plantDate) + " Yield: " + "\n"
                + yield + " kg";

        return summary;
    }

    /**
     * Returns Crop Name
     *
     * @return
     */
    public String getCropName() {
        return crop.getName();
    }

    /**
     * Returns Plant Date
     *
     * @return
     */
    public Date getPlantDate() {
        return plantDate;
    }

    /**
     * Returns Harvest Date
     *
     * @return
     */
    public Date getHarvestDate() {
        return harvestDate;
    }

    /**
     * Returns Yield
     *
     * @return
     */
    public int getYield() {
        return yield;
    }
}
