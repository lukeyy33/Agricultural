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
    private Location location;

    public SetOfFarmerTest() {
        
    }

    @Before
    public void setUp() {
      instance = new SetOfFarmers();
      farms = new SetOfFarms();
      instance.addFarmer("name", "email", "1010101", 56, farms);
    }

    @Test
    public void testAddFarmer() {   
        //Check the farmer doesn't exist (by id)
        Farmer result = instance.getFarmerByNumber(45);
        assertNull(result);
        //Add the farmer
        instance.addFarmer("name", "email", "telephone", 45, farms);
        //Get the recently added farmer by id
        Farmer result1 = instance.getFarmerByNumber(45);
        //Check it's added
        assertNotNull(result1);
     
    }    
    @Test 
    public void testGetFarmerByName() {
        String name = "name";
        //Arrange
        Farmer tmp = instance.getFarmerByName(name);
        //Act
        String farmerName = tmp.getName();
        //Assert
        assertEquals(name, farmerName);
        
    }
    
    @Test
    public void testRemoveFarmer() {
        //Arrange
        instance.addFarmer("Test", "test@gmail.co.uk", "420", 420, farms); //Remember to update this
        //constructor when jonas is done
        //Act
        Farmer result = instance.getFarmerByNumber(420);
        //Assert
        assertNotNull(result);      
        //then remove
        instance.removeFarmer(420);
        //Arrange
        Farmer result1 = instance.getFarmerByNumber(420);
        //Assert
        assertNull(result1);
    }
}
