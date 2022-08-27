

package regexexample2;

import java.util.regex.*;
public class regexexample7 {
    public static void main(String args[])
    {
        System.out.println(Pattern.matches("[786]{1}[0-9]{6}", "9953038949"));
        System.out.println(Pattern.matches("[789][0-9]{9}", "8953038949"));l
        
        System.out.println(Pattern.matches("[789][0-9]{9}", "99530389490"));
        System.out.println(Pattern.matches("[789][0-9]{9}}", "6953038949"));
        System.out.println(Pattern.matches("[789][0-9]{9}", "8853038949"));
        
        System.out.println("by metacharacters...");
        
        System.out.println(Pattern.matches("[789]{1}\\d{9}","8853038949"));
        System.out.println(Pattern.matches("[789]{1}\\d{9}","3853038949"));
    }
    
}
