/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testingexamples;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author webbe
 */
public class CheckAddUtilities {

   /**
    * Add two ints checking that it doesn't cause the result to truncate because
    * of overflow or underflow because the result is too big or too small to fit
    * in an int.
    * @param a first operand - any int value is allowable
    * @param b second operand - any int value is allowable
    * @return result of adding a and b.  If the result causes underflow
    * or overflow then return 0
    */
   public int checkAdd(int a, int b) {
      long r = (long) a + (long) b;
      if (r > Integer.MAX_VALUE || r < Integer.MIN_VALUE) {
         return 0;
      }
      return (int) r;
   }
}
