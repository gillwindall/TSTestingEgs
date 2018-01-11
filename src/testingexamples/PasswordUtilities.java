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
public class PasswordUtilities {

   /**
    * Checks that a password is valid according to the following rules: 
    * <ul>
    * <li>length between 6 and 10 characters
    * <li>must contain at least one: 
    *   uppercase letter (A to Z),
    *   lowercase letter (a to z),
    *   numeric digit (0 to 9)
    * <li>must only contain upper and lowercase letters and numeric digits
    * </ul>
    * @param pwd the password to be tested - must not be null, can be empty
    * @return true if the password is valid according to the above rules
    * and false otherwise
    * @throws IllegalArgumentException pwd passed in as null
    */
   public boolean isValidPassword(String pwd) {
      if (pwd == null)
         throw new IllegalArgumentException("password cannot be null");
      
      // use a regex to test the pwd meets the criteria for being valid
      String r = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])[a-zA-Z0-9]{6,10}$";
      
      return pwd.matches(r);   
      
   }
}
