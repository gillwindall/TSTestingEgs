/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testingexamples;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author webbe
 */
public class CheckAddUtilitiesTest {

   /**
    * Test of checkAdd method, of class CheckAddUtilities.
    */
   @Test
   public void testCheckAdd() {
      System.out.println("checkAdd");
      int a = Integer.MAX_VALUE;
      int b = 1;
      CheckAddUtilities instance = new CheckAddUtilities();
      int expResult = 0;
      int result = instance.checkAdd(a, b);
      assertEquals(expResult, result);
   }
   
}
