/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Tom
 */
public class SetOfFarmsTest {

    SetOfFarms instance = new SetOfFarms();
    Farm instanceFarm = new Farm("Test Farm", new Location(0, 0, "Cow Farm"), 2123);

    public SetOfFarmsTest() {
    }

    @Before
    public void setUp() {
        instance.addFarmAlreadyInSystem(instanceFarm);
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of addFarm method, of class SetOfFarms.
     */
    @Test
    public void testAddFarm() {
        System.out.println("addFarm");
        String name = "Add Test";
        Location location = new Location(22, 22, "Taylor Swift");
        int id = 22;
        instance.addFarm(name, location, id);
        Farm result = instance.getFarmByNumber(22);
        assertNotNull(result);
    }

    /**
     * Test of getFarmByName method, of class SetOfFarms.
     */
    @Test
    public void testGetFarmByName() {

        Farm expResult = instanceFarm;
        Farm result = instance.getFarmByName("Test Farm");
        assertEquals(expResult, result);

        Farm result1 = instance.getFarmByName("test farm");
        assertEquals(expResult, result);

        Farm result2 = instance.getFarmByName("TEST FARM");
        assertEquals(expResult, result);
    }

    /**
     * Test of removeFarm method, of class SetOfFarms.
     */
    @Test
    public void testRemoveFarm() {
        assertNotNull(instance.getFarmByNumber(2123));
        instance.removeFarm(instanceFarm);
        assertNull(instance.getFarmByNumber(2123));
    }

    /**
     * Test of getAllFarms method, of class SetOfFarms.
     */
    @Test
    public void testGetAllFarms() {
        ArrayList<Farm> expResult = instance.getAllFarms();
        ArrayList<Farm> result = instance.getAllFarms();
        assertEquals(expResult, result);
    }

}
