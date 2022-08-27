import java.util.regex.*;
class Regexexample2 
{
   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(Pattern.matches(".s","as"));
        System.out.println(Pattern.matches(".s","mk"));
        System.out.println(Pattern.matches(".s","mst"));
        System.out.println(Pattern.matches(".s","amms"));
        System.out.println(Pattern.matches("..s","mas"));
        // TODO code application logic here
    }
    
}
