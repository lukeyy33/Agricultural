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
    private Field fieldName;
    
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
        farm = new Farm();

    }
    
    @After
    public void tearDown() {
    }
    @Test
    public void testGetFieldByName() {
        
        String name = "Field 1";
        fieldName = farm.getFieldByName(name);
        //Expected "Field 1", 
        assertEquals(name, fieldName);
    }

    @Ignore
    @Test
    public void testRemoveField() {
        Farm field = new Farm();
        int result = field.removeField(0);       
              
        assertEquals(field, result);
    }

}
