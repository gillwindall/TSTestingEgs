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
public class PasswordUtilitiesTest {


   @Test
   public void isValidPassword_valid6Chars_true() {
      String pwd = "Ab1234";
      PasswordUtilities instance = new PasswordUtilities();
      boolean expResult = true;
      boolean result = instance.isValidPassword(pwd);
      assertEquals(expResult, result);
   }

   @Test
   public void isValidPassword_valid10Chars_true() {
      String pwd = "1Ab2Cd3Ef0";
      PasswordUtilities instance = new PasswordUtilities();
      boolean expResult = true;
      boolean result = instance.isValidPassword(pwd);
      assertEquals(expResult, result);
   }

   @Test
   public void isValidPassword_tooshort5Chars_false() {
      String pwd = "Abc18";
      PasswordUtilities instance = new PasswordUtilities();
      boolean expResult = false;
      boolean result = instance.isValidPassword(pwd);
      assertEquals(expResult, result);
   }

   @Test
   public void isValidPassword_toolong11Chars_false() {
      String pwd = "AAbbCC11223";
      PasswordUtilities instance = new PasswordUtilities();
      boolean expResult = false;
      boolean result = instance.isValidPassword(pwd);
      assertEquals(expResult, result);
   }

   @Test
   public void isValidPassword_noUpperCase_false() {
      String pwd = "12345a";
      PasswordUtilities instance = new PasswordUtilities();
      boolean expResult = false;
      boolean result = instance.isValidPassword(pwd);
      assertEquals(expResult, result);
   }

   @Test
   public void isValidPassword_noLowerCase_false() {
      String pwd = "ABC2345";
      PasswordUtilities instance = new PasswordUtilities();
      boolean expResult = false;
      boolean result = instance.isValidPassword(pwd);
      assertEquals(expResult, result);
   }

   @Test
   public void isValidPassword_noNumbers_false() {
      String pwd = "ABCdef";
      PasswordUtilities instance = new PasswordUtilities();
      boolean expResult = false;
      boolean result = instance.isValidPassword(pwd);
      assertEquals(expResult, result);
   }

   @Test
   public void isValidPassword_invalidChar_false() {
      String pwd = "Ab1234*";
      PasswordUtilities instance = new PasswordUtilities();
      boolean expResult = false;
      boolean result = instance.isValidPassword(pwd);
      assertEquals(expResult, result);
   }

   // Note that with JUnit 5 you can test for exceptions
   // using assertThrows which is better than expected =
   @Test(expected = IllegalArgumentException.class)
   public void isValidPassword_nullString_false() {
      String pwd = null;
      PasswordUtilities instance = new PasswordUtilities();
      boolean result = instance.isValidPassword(pwd);
   }

   @Test
   public void isValidPassword_emptyString_false() {
      String pwd = "";
      PasswordUtilities instance = new PasswordUtilities();
      boolean expResult = false;
      boolean result = instance.isValidPassword(pwd);
      assertEquals(expResult, result);

   }
}
