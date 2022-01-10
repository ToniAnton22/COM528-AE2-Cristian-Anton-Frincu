/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.solent.com504.oodd.cart.dao.test;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.solent.com504.oodd.cart.model.dto.User;
import org.solent.com504.oodd.connection.DbCon;
import org.solent.com504.oodd.cart.dao.impl.UserDao;

/**
 *
 * @author Brother
 */
public class UserDaoTest {
    
    public UserDaoTest() {
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
     * Test of userLogin method, of class UserDao.
     */
    @Test
    public void testUserLogin() {
        System.out.println("userLogin");
        int id = 1;
        String name = "Almamun";
        String username = "almamun@mail.com";
        String password = "123456";
        DbCon connection = new DbCon();
        User expResult = new User();
        
        UserDao instance;
        try {
            instance = new UserDao(connection.getConnection());
            
            User result = instance.userLogin(username, password);
            assertEquals(0,result.compare(result,expResult));
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserDaoTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(UserDaoTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        

        // TODO review the generated test code and remove the default call to fail.
     

    
    }
}
