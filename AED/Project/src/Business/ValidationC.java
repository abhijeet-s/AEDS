/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Abhijeet
 */
public class ValidationC {
    
    public static boolean isEmpty (String check)
    {
     
      if (check.isEmpty() || check == null || check.trim().isEmpty())
      {
      return true;
      }
      else 
      {
          return false;
      }
    }
    public static boolean emailVal(String em)
    {
        String pat = "^(.+)@(.+)$"; 
          Pattern p = Pattern.compile( pat );
          Matcher m = p.matcher(em);
          return m.matches();
    }
    public static boolean passVal(String pass)
      {
          String pat = "((?=.*\\d)(?=.*[A-Z]).{6,20})"; 
          Pattern p = Pattern.compile( pat );
          Matcher m = p.matcher(pass);
          return m.matches();
          
          
      }
      public static int randomNum(int low , int high)
      {
          int r;
          Random rand = new Random();
          r = rand.nextInt(high -low)+low;
          return r;
          
          
      }
    
   
}
