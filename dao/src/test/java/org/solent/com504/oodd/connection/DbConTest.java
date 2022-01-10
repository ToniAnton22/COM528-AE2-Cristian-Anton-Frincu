/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.solent.com504.oodd.connection;


import java.sql.Connection;
import java.sql.SQLException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Cristian Anton Frincu
 */
public class DbConTest {
    
    public DbConTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
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

    /**
     * Test of getConnection method, of class DbCon.
     */
    @Test
    public void testGetConnection() throws Exception {
        System.out.println("getConnection");
    
        Connection expResult = DbCon.getConnection();
        Connection result = DbCon.getConnection();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
