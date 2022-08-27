/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package regexexample2;

/**
 *
 * @author Arya
 */
import java.util.regex.*;
public class regexexample6 {
    public static void main(String args[])
    {
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "zhaRAD"));
        System.out.println(Pattern.matches("[0-9]{10}", "9876543211"));
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "kkvarun32"));
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "JA2YK2"));
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "arun52"));
    }
    
}
