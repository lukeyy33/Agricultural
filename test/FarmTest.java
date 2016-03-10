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
    
    @BeforeClass
    public static void setUpClass() {
   
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        farm = new Farm("Farm 1", new Location(), 0);
        farm.addField("Field 1", "", 0, "", 0.0f);
        farm.addField("Field 2", "", 0, "", 0.0f);
    }
    
    @After
    public void tearDown() {
    }
    @Test
    public void testGetFieldByName() {
        
        /*String name = "Field 1";
        Field tmp = farm.getFieldByName(name);
        String fieldName = tmp.getName();
        //Expected "Field 1", 
        assertEquals(name, fieldName); */
        
        
        String name = "Field 2";
        Field tmp = farm.getFieldByName(name);
        String fieldName = tmp.getName();
        assertEquals(name,fieldName);
    }

    @Test
    public void testRemoveField() {
        int result;
        //test it's there
        //then remove
        //then test it's there
        
        //result = farm.removeField(0);
        
        

    }

}
