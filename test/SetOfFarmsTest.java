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
    
    public SetOfFarmsTest() {
    }
    
    @Before
    public void setUp() {
        instance.addFarm("Test Farm", new Location(0,0,"Cow Farm"), 2123);
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
        Location location = new Location(22,22,"Taylor Swift");
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
        System.out.println("getFarmByName");
        String farmName = "";
        SetOfFarms instance = new SetOfFarms();
        Farm expResult = null;
        Farm result = instance.getFarmByName(farmName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeFarm method, of class SetOfFarms.
     */
    @Test
    public void testRemoveFarm() {
        System.out.println("removeFarm");
        Farm farm = null;
        SetOfFarms instance = new SetOfFarms();
        instance.removeFarm(farm);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFarmByNumber method, of class SetOfFarms.
     */
    @Test
    public void testGetFarmByNumber() {
        System.out.println("getFarmByNumber");
        int farmNumber = 0;
        SetOfFarms instance = new SetOfFarms();
        Farm expResult = null;
        Farm result = instance.getFarmByNumber(farmNumber);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllFarms method, of class SetOfFarms.
     */
    @Test
    public void testGetAllFarms() {
        System.out.println("getAllFarms");
        SetOfFarms instance = new SetOfFarms();
        ArrayList<Farm> expResult = null;
        ArrayList<Farm> result = instance.getAllFarms();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
