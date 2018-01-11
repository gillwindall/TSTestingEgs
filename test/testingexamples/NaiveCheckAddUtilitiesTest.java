/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testingexamples;

/**
 *
 * @author webbe
 */
public class NaiveCheckAddUtilitiesTest {

   public static void main(String[] args) {
      CheckAddUtilities cau = new CheckAddUtilities();

      System.out.println(cau.checkAdd(3, 5)); // normal
      System.out.println(cau.checkAdd(Integer.MAX_VALUE - 1, 1)); // just below MAX boundary
      System.out.println(cau.checkAdd(Integer.MAX_VALUE, 1)); // MAX boundary
      System.out.println(cau.checkAdd(Integer.MIN_VALUE + 1, -1)); // just below MIN boundary
      System.out.println(cau.checkAdd(Integer.MIN_VALUE, -1)); // MIN boundary
   }

}
