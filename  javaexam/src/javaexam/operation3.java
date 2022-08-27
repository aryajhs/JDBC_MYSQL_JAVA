
import java.util.*;
import java.sql.*;
public class operation3 extends Javaexam{
    
    void insert()
    {
        try
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter sno");
            int sno = sc.nextInt();
            System.out.println("Enter name");
            String name = sc.next();
            System.out.println("Enter course");
            String course = sc.next();
            System.out.println("Enter bloodgroup");
            String bloodgroup = sc.next();
            
            String insertquery = "insert into student value(?,?,?,?)";
            
            PreparedStatement pst = dog.prepareStatement(insertquery);            pst.setInt(1, sno);
            pst.setString(2,name);
            pst.setString(3,course);
            pst.setString(4,bloodgroup);
            
            pst.executeUpdate();
            System.out.println("Data inserteddd...");
            
        }
        catch(Exception e)
        {
            System.out.println("Data not inserted");
            
        }
    }
    void delete()
    {
        try
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter sno");
            int sno = sc.nextInt();
            String delquery="delete from student where sno="+sno;
            
            PreparedStatement pst2=dog.prepareStatement(delquery);
            
            pst2.executeUpdate();
            System.out.println("data deleted..");
                    
        }
        catch(Exception e)
        {
            System.out.println("data not deleted");
         
        }
        
    }
    void view()
    {
         try
        {
            String viewquery= "select* from student";
            
            Statement stmt= dog.createStatement();
            
            ResultSet rs= stmt.executeQuery(viewquery);
            while(rs.next())
            {
                System.out.print(" "+rs.getInt(1));
                System.out.print(" "+rs.getString(2));
                System.out.print(" "+rs.getString(3));
                System.out.print(" "+rs.getString(4));
                System.out.print("\n");
            }
            
            System.out.println("view fuction working");
        }
        catch(Exception e)
        {
            System.out.println("view not working");
         
        }
        
    }
    void update()
    {
        try
        {
             Scanner sc = new Scanner(System.in);
             Statement stmt = dog.createStatement();
             System.out.println("Enter name to be changed");
             String name2 = sc.next();
             String sql = "UPDATE student " +
            "SET name = '" + name2 + " 'WHERE sno in (1)";
         stmt.executeUpdate(sql);
         System.out.println("Data updated");
            
        }
        catch(Exception e)
        {
            System.out.println("Not updated");
        }
        
        
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        operation3 obj = new operation3();
        while(true)
        {
            System.out.println("Enter 1 to insert data");
            System.out.println("Enter 2 to update data");
            System.out.println("Enter 3 to delete data");
            System.out.println("Enter 4 to view");
            System.out.println("Enter 5 to EXIT \n\n");
            int i = sc.nextInt();
            switch(i)
            {
                case 1 : 
                    obj.insert();
                    break;
                case 2 : 
                    obj.update();
                    break;
                case 3 : 
                    obj.delete();
                    break;
                case 4 : 
                    obj.view();
                    break;
                case 5 : 
                    System.exit(0);
                    break;
                default :
                    System.out.println("Sahi value daal laude");
            }
        }
    
    }
}
