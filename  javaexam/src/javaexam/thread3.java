 public class thread3 extends Thread
 {
    
      public void run()
    {
        
        try
        {
            for(int i=1;i<=5;i++)
            {
                System.out.println("chuttu");
                Thread.sleep(2000);
            }
          
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally
        {
            System.out.println("gfh");
        }
    }
    
     
 }
class thread5 extends thread3 implements Runnable
{
    public void run()
    {
        
        
        try
        {
            for(int i=1;i<=5;i++)
            {
                System.out.println("muttu");
                Thread.sleep(2000);
            }
          
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
    
}
class thread4   
        {
    public static void main(String args[])
    {
        
        thread5 obj = new thread5();
        Thread th = new Thread(obj);
         
        thread3 obj2 = new thread3();
        Thread th2 = new Thread(obj2);
         
        th2.start();
      
        th.start();
        
    }
    
}