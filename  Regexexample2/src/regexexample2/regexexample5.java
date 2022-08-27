import java.util.regex.*;
public class regexexample5 {
    public static void main(String args[])
    {
        System.out.println("metacharacters d...." ); //d means digit
        
        System.out.println(Pattern.matches("\\d", "abc"));//false non digit
        System.out.println(Pattern.matches("\\d", "5"));
        System.out.println(Pattern.matches("\\d", "4443"));//false digit but more than once
        
        System.out.println(Pattern.matches("\\d", "323abc"));//false digit and char
        
        System.out.println("metacharacters D...." );// means non digit
        
        System.out.println(Pattern.matches("\\D", "abc"));// false non digit but come more than once
        
        System.out.println(Pattern.matches("\\D", "1"));//false digit 
        System.out.println(Pattern.matches("\\D", "4443"));
        System.out.println(Pattern.matches("\\D", "323abc"));
        System.out.println(Pattern.matches("\\D", "m"));
        
        System.out.println("metacharacters D with quantifier...");
        System.out.println(Pattern.matches("\\D*", "mak"));
        
    }
    
}
