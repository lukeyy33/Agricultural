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

/**
 *
 * @author 11007
 */
public class FieldTestCase {
    private Field instance;
    private static FieldStation[] fieldStation;
    
    public FieldTestCase() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        fieldStation = new FieldStation[10];
        
        fieldStation[0] = new FieldStation();
        fieldStation[1] = new FieldStation();
        fieldStation[2] = new FieldStation();
        fieldStation[3] = new FieldStation();
    }
    
    @AfterClass
    public static void tearDownClass() {
        
    }
    
    @Before
    public void setUp() {
        
    }
    
    @After
    public void tearDown() {
        
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
