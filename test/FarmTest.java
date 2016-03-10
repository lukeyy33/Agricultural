/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;


public class FarmTest {
    
    private static Farm farm;
    
    public FarmTest() {
    }
        
    @Before
    public void setUp() {
        farm = new Farm("Farm 1", new Location(0, 0, "Test"), 0);
        farm.addField("Field 1", "", 0, "", 0.0f);
        farm.addField("Field 2", "", 0, "", 0.0f);      
    }   
    @Test
    public void testGetFieldByName() {     
        //Exact
        String name = "Field 1";
        Field tmp = farm.getFieldByName(name);
        String fieldName = tmp.getName(); 
        assertEquals(name, fieldName); 
        //Upper case        
        Field tmp2 = farm.getFieldByName("FIELD 1");
        String fieldName2 = tmp2.getName(); 
        assertEquals(name, fieldName2); 
        //Lower Case        
        Field tmp3 = farm.getFieldByName("field 1");
        String fieldName3 = tmp3.getName(); 
        assertEquals(name, fieldName3); 
    }
    @Test 
    public void testRemoveField() {
        //Arrange
        farm.addField("Field Test", "Test", 101, "Test", 0.5f);       
        //Act
        Field result = farm.getFieldByNumber(101);
        //Assert
        assertNotNull(result);      
        //then remove
        farm.removeField(101);            
        //Arrange
        Field result1 = farm.getFieldByNumber(101);
        //Assert
        assertNull(result1);
    }
    @Test 
    public void testAddField() {    
        //Act
        Field result = farm.getFieldByNumber(101);
        //Assert
        assertNull(result);      
        //then remove
        farm.addField("Field Test", "Test", 101, "Test", 0.5f);            
        //Arrange
        Field result1 = farm.getFieldByNumber(101);
        //Assert
        assertNotNull(result1);
        
    }
    @Test
    public void testAddFarmInfo() {       
        Location location = new Location(1, 1, "farmTest");
        int id = 10101;
        String name = "FarmLocation";
               
        assertEquals("Farm 1", farm.getName());
        assertEquals("0", Integer.toString(farm.getFarmNo()));
        
        assertEquals("0", Integer.toString((int) farm.getLocation().getXCoord()));
        assertEquals("0", Integer.toString((int) farm.getLocation().getYCoord()));        
        assertEquals("Test", farm.getLocation().getType());
        
        farm.updateFarmInfo(name, location, id);
        
        assertEquals("FarmLocation", farm.getName());
        assertEquals("10101", Integer.toString(farm.getFarmNo()));
        
        assertEquals("1", Integer.toString((int) farm.getLocation().getXCoord()));
        assertEquals("1", Integer.toString((int) farm.getLocation().getYCoord()));        
        assertEquals("farmTest", farm.getLocation().getType());
        
        
    }

}
