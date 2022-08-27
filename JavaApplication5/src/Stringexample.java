import java.util.Scanner;
import java.util.*;
public class Stringexample {
    public static void main(String args[])
    {
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.println("INPUT YOUR NAME");
        str = sc.nextLine();
        str=str.trim();
        int l = str.length();
        System.out.print(str.charAt(0));
        for(int i=1;i<l;i++)
        {//System.out.println("loop");
             
            if(str.charAt(i)==' ')
            {
                System.out.print(str.charAt(i+1));
                i+=1;
            }
        }
                System.out.println();
    }
    
}
