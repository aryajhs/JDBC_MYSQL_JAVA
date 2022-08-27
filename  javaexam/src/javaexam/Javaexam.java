import java.sql.*;
public class Javaexam
{
    Connection dog;
    Javaexam()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            String connectionURL="jdbc:mysql://localhost:3306/final";
            dog = DriverManager.getConnection(connectionURL,"root","root");
            
            System.out.println("Connection sucess");
        }
        catch(Exception e)
        {
            System.out.println("Connection failed");
        }
    }
    
    
    public static void main(String args[])
    {
        Javaexam obj = new Javaexam();
    }
}