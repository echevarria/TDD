/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Avell B155 MAX
 */
public class FizzBuzzTest {
    
    FizzBuzz instance;
    
    public FizzBuzzTest() {
        this.instance = new FizzBuzz();
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

    
    public void testSomeMethod() {
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    @Test
    public void testeNumeroQualquer() throws Exception {
        assertEquals("7", this.instance.fizzbuzz(7));
    }
    
    @Test
    public void testeFizz() throws Exception {
        assertEquals("fizz", this.instance.fizzbuzz(3));
    }
    
    @Test
    public void testeBuzz() throws Exception {
        assertEquals("buzz", this.instance.fizzbuzz(5));
    }
    
    @Test
    public void testeFizzBuzz() throws Exception {
        assertEquals("fizz buzz", this.instance.fizzbuzz(15));
    }
    
    @Test(expected = Exception.class)
    public void testeNumeroInvalido() throws Exception {
        this.instance.fizzbuzz(0);
    }
    
}
