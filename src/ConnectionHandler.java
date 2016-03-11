

import java.io.Serializable;
import java.util.*;

/**
 *Connection Handler Class
 * @author Dan
 */
public class ConnectionHandler implements Serializable {

    private String type;
    private String[] results;

    /**
     *
     */
    public ConnectionHandler() {
    }

    

    /**
     *connect takes the unique id the sensor or field station transmits and creates the connection to the physical device
     * @param uniqueID
     */
    public void connect(String uniqueID) {
        // TODO implement here
    }

   

    /**
     *similar to connect, but removes the connection to the physical device  
     * @param uniqueID
     */
    public void disconnect(String uniqueID) {
        // TODO implement here
    }

    /**
     * Detects all devices (within its wireless range, whatever that is,
     * probably dependent on the wireless dongle manufacturer) This will return
     * a list of the device serial nos - unfortunately this won't mean much to a
     * user seeing e.g. XGHFG-575 GFDKS-473 CHGUE-882 So (this is
     * user-dependent) the user will have to either add one sensor at a time (so
     * they remember what it is they wanted to add), or make note of all the
     * serial numbers and remember which sensors they correspond to
     */
    public void scanFieldStations() {
        // TODO implement here
    }

    

    /**
     *updates results held in connection handler of a particular field station with a list of devices currently in range
     */
    public void scanSensors() {
        // TODO implement here
    }

    /**
     *Return the type
     * @return
     */
    public String getType() {
        // TODO implement here
        return this.type;
    }

    /**
     *Return the results
     * @return
     */
    public String[] getResults() {
        // TODO implement here
        return this.results;
    }

}
