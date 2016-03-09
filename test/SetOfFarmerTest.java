/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;


public class SetOfFarmerTest {
    
    private SetOfFarmers instance;
    private SetOfFarms farms;

    public SetOfFarmerTest() {
        
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("* UtilsJUnit4Test: @BeforeClass method");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("* UtilsJUnit4Test: @AfterClass method");
    }
    
    @Before
    public void setUp() {
       System.out.println("* UtilsJUnit4Test: @Before method");
    }
    
    @After
    public void tearDown() {
        System.out.println("* UtilsJUnit4Test: @After method");
    }
    
    @Ignore    
    @Test
    public void testAddFarmer() {            
        //Arrange
        SetOfFarmers farmer = new SetOfFarmers();
        instance = new SetOfFarmers();                    
        //Act
        farmer.addFarmer("Test", "test@test.test", "1010", 1, farms);      
        //Assert
        assertEquals(farmer,instance);
        //assertEquals(EXPECTED-RESULT, ACTUAL-RESULT);
        
    }

    
    @Test 
    public void testGetFarmerByName() {
        //Arrange
        SetOfFarmers farmerName = new SetOfFarmers();
        //Act
        farmerName.getFarmerByName("Luke");        
        //Assert
        assertEquals("Luke", farmerName);
        
    }
}
