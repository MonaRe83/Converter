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
 * @author User
 */
public class ConverterTestTest {
    
    public ConverterTestTest() {
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
     * Test of add method, of class ConverterTest.
     */
    
    // doing two tests for each unit to ensure that a double work with any number format for converting units
    @Test
    public void cmToinch() {  // Testing case of  converting cm to inch with a low value 
        System.out.println("cmToinch");
        double number1 = 1;
        double number2 = 0.393700787;
        ConverterTest instance = new ConverterTest();
        double expResult = 0.393700787;
        double result = instance.ConvertToNew(number1, number2);
        assertEquals(Double.doubleToLongBits(expResult), Double.doubleToLongBits(result));
        
    }
  @Test
    public void cmToinch1() {  // Testing case of  converting cm to inch with a high value 
        System.out.println("cmToinch1");
        double number1 = 10;
        double number2 = 0.393700787;
        ConverterTest instance = new ConverterTest();
        double expResult = 3.93700787;
        double result = instance.ConvertToNew(number1, number2);
        assertEquals(Double.doubleToLongBits(expResult), Double.doubleToLongBits(result));
        
    }
    
    @Test
    public void metreTofeet() {  // Testing case of  converting metre to feet with a low value
        System.out.println("metreTofeet");
        double number1 = 1;
        double number2 = 3.280839895;
        ConverterTest instance = new ConverterTest();
        double expResult = 3.280839895;
        double result = instance.ConvertToNew(number1, number2);
        assertEquals(Double.doubleToLongBits(expResult), Double.doubleToLongBits(result));
        
    }
     @Test
    public void metreTofeet1() {  // Testing case of  converting metre to feet with a high value
        System.out.println("metreTofeet1");
        double number1 = 10;
        double number2 = 3.2808398;
        ConverterTest instance = new ConverterTest();
        double expResult = 32.808398;
        double result = instance.ConvertToNew(number1, number2);
        assertEquals(Double.doubleToLongBits(expResult), Double.doubleToLongBits(result));
        
    }
    
     @Test
    public void celsiusTofahrenheit() {  // Testing case of  converting celsiusTofahrenheit with a low value
        System.out.println("celsiusTofahrenheit");
        double number1 = 1;
        double number2 = 33.8;
        ConverterTest instance = new ConverterTest();
        double expResult = 33.8;
        double result = instance.ConvertToNew(number1, number2);
        assertEquals(Double.doubleToLongBits(expResult), Double.doubleToLongBits(result));
       
    }
    
    @Test
    public void celsiusTofahrenheit1() {  // Testing case of  converting celsiusTofahrenheit with a high value
        System.out.println("celsiusTofahrenheit1");
        double number1 = 10;
        double number2 = 33.8;
        ConverterTest instance = new ConverterTest();
        double expResult = 338;
        double result = instance.ConvertToNew(number1, number2);
        assertEquals(Double.doubleToLongBits(expResult), Double.doubleToLongBits(result));

       
    }
    
     @Test
    public void mileTokm() {  // Testing case of  mileTokm with a low value
        System.out.println("mileTokm");
        double number1 = 1;
        double number2 = 1.60935;
        ConverterTest instance = new ConverterTest();
        double expResult = 1.60935;
        double result = instance.ConvertToNew(number1, number2);
        assertEquals(Double.doubleToLongBits(expResult), Double.doubleToLongBits(result));
        
    }
        @Test
    public void mileTokm1() {  // Testing case of  mileTokm with a high value
        System.out.println("mileTokm1");
        double number1 = 10;
        double number2 = 1.60935;
        ConverterTest instance = new ConverterTest();
        double expResult = 16.0935;
        double result = instance.ConvertToNew(number1, number2);
        assertEquals(Double.doubleToLongBits(expResult), Double.doubleToLongBits(result));
        
       
         }
        @Test
    public void cmTofeet() {  // Testing case of  cmTofeet with a low value
        System.out.println("cmTofeet");
        double number1 = 1;
        double number2 = 0.032808399;
        ConverterTest instance = new ConverterTest();
        double expResult = 0.032808399;
        double result = instance.ConvertToNew(number1, number2);
        assertEquals(Double.doubleToLongBits(expResult), Double.doubleToLongBits(result));
        
      
         }
        @Test
    public void cmTofeet1() {  // Testing case of  cmTofeet with a high value
        System.out.println("cmTofeet1");
        double number1 = 10;
        double number2 = 0.032808399;
        ConverterTest instance = new ConverterTest();
        double expResult = 0.32808399;
        double result = instance.ConvertToNew(number1, number2);
        assertEquals(Double.doubleToLongBits(expResult), Double.doubleToLongBits(result));
        
       
    }
}
