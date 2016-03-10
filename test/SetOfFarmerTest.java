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
      location = new Location(10, 20, "Fake Location");
      instance.addFarmer("name", "email", "1010101", 56, farms);
    }
    @Ignore
    @Test
    public void testAddFarmer() {    
        Farmer result = instance.addFarmer("Bob", "email", "3434", 0, farms);
        instance.addFarmer("name", "email", "01919", 0, farms);
        //Assert
        assertEquals(farms,instance);
     
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
}
