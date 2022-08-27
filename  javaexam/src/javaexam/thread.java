
class multithreadig2 extends Thread
{
    public void run()
    {
        try
        {
        for(int i=5 ; i>0 ; i++)
        {
            System.out.println("dedde");
            Thread.sleep(1000);
        }
        }   
        catch(Exception e)
        {
                
        }
    }
}

class multithreading extends multithreadig2 implements Runnable
{
    public void run()
    {
        try
        {
            for(int i=1;i<=10;i++)
            {
                System.out.println("multi1");
                Thread.sleep(2000);
                
            }
        }
        catch(Exception e)
        {
            System.out.println("error");
            
        }
        
    
    }



    public static void main(String args[])
    {
         multithreading th = new multithreading();
         multithreadig2 th2 = new multithreadig2();
       
        Thread gt = new Thread(th);
        Thread ht = new Thread(th2);
        
        gt.start();
        ht.start();
       
    }
}
