import java.util.regex.Pattern;
import java.util.regex.Matcher;
class Regexexample3
{
   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
        System.out.println(Pattern.matches("[amn]","abcd"));
        System.out.println(Pattern.matches("[amn]","a"));
        System.out.println(Pattern.matches("[amn]","ammmma"));
        System.out.println(Pattern.matches("[amn]","n"));
         
        // TODO code application logic here
    }
    
}
