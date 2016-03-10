/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class FieldTest {
    private Field instance;
    private static FieldStation[] fieldStation;
    private String name;
    private Location currentLocation;
    private float cropArea;
    
    public FieldTest() {
    }
       
    @Before
    public void setUp() {
        fieldStation = new FieldStation[4];
        
        fieldStation[0] = new FieldStation();
        fieldStation[1] = new FieldStation();
        fieldStation[2] = new FieldStation();
        fieldStation[3] = new FieldStation();
        
    }
    
    @After
    public void tearDown() {
        
    }

    // The methods must be annotated with annotation @Test. For example:
    @Test
    public void testGetFieldStationByName() {
        FieldStation result;
        //Exact match
        result = instance.getFieldStationByName("Outdoor");
        assertEquals(1, result.getName());
        

        //Partial Match
        result = instance.getFieldStationByName("ou");
        assertEquals(1, result.getName());
//        assertEquals(fieldStation[0], result.getFieldStationNo());

        //Mixed Case
        result = instance.getFieldStationByName("OUT");
        assertEquals(1, result.getName());
//        assertEquals(fieldStation[0], result.get(0));

        //Multiple Matches
        result = instance.getFieldStationByName("door");
        assertEquals(1, result.getName());
//        assertEquals(fieldStation[0], result.get(0));

        //Unknown Field Station
        result = instance.getFieldStationByName("Random");
        assertEquals(1, result.getName());
//        assertEquals(fieldStation[0], result.get(0));
    }
}
