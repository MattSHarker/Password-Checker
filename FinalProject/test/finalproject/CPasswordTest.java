/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Matthew
 */
public class CPasswordTest
{    
    public CPasswordTest() {}
    
    @BeforeClass
    public static void setUpClass() {}
    
    @AfterClass
    public static void tearDownClass() {}
    
    @Before
    public void setUp() {}
    
    @After
    public void tearDown() {}

    
    /**
     * Tests the length of the password
     * 
     * password.length() should return false
     */
    @Test
    public void testLengthFalse()
    {
        System.out.println("Length: False");
        CPassword password;
        password = new CPassword("12345");
        
        assertEquals(false, password.length());
    }
    
    /**
     * Tests the length of the password
     * 
     * password.length() should return true 
     */
    @Test
    public void testLengthTrue()
    {
        System.out.println("Length: True");
        CPassword password;
        password = new CPassword("123456");
        
        assertEquals(true, password.length());
    }
    
    
    /**
     * Test of upper method, of class CPassword.
     * 
     * password.upper() should return false
     */
    @Test
    public void testUpperFalse() {
        System.out.println("Upper: false");
        CPassword password = new CPassword("abcdef");
        
        assertEquals(false, password.upper());
    }
    
    /**
     * Test of upper method, of class CPassword.
     * 
     * password.upper() should return true
     */
    @Test
    public void testUpperTrue() {
        System.out.println("Upper: true");
        CPassword password = new CPassword("Abcdef");
        
        assertEquals(true, password.upper());
    }

    
    /**
     * Test of lower method, of class CPassword.
     * 
     * password.lower() should return false
     */
    @Test
    public void testLowerFalse() {
        System.out.println("Lower: false");
        CPassword password = new CPassword("ABCDEF");
        
        assertEquals(false, password.lower());
    }
    
    /**
     * Test of lower method, of class CPassword.
     * 
     * password.lower() should return true
     */
    @Test
    public void testLowerTrue() {
        System.out.println("Lower: true");
        CPassword password = new CPassword("ABCdEF");
        
        assertEquals(true, password.lower());
    }

    
    /**
     * Test of digit method, of class CPassword.
     * 
     * password.digit() should return false
     */
    @Test
    public void testDigitFalse() {
        System.out.println("Digit: false");
        CPassword password = new CPassword("abcdef");
        
        assertEquals(false, password.digit());
    }
    
    /**
     * Test of digit method, of class CPassword.
     * 
     * password.digit() should return true
     */
    @Test
    public void testDigitTrue() {
        System.out.println("Digit: true");
        CPassword password = new CPassword("abcde6");
        
        assertEquals(true, password.digit());
    }

    
    /**
     * Test of special method, of class CPassword.
     * 
     * password.special() should return false
     */
    @Test
    public void testSpecialFalse() {
        System.out.println("Special: false");
        CPassword password = new CPassword("abcdef");
        
        assertEquals(false, password.special());
    }
    
    /**
     * Test of special method, of class CPassword.
     * 
     * password.special() should return true
     */
    @Test
    public void testSpecialTrue() {
        System.out.println("Special: true");
        CPassword password = new CPassword("abcde^");
        
        assertEquals(true, password.special());
    }    
}
