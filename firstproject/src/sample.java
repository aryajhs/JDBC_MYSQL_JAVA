class ABC
{
    void func()
    {
        System.out.println("fn working");
    }
    
}
class demo extends ABC implements Runnable
{
    public void run()
    {
        for(int i=0;i<=10;i++)
        {
            System.out.println(i);
            try
            {
              Thread.sleep(4000);
            }
            catch(Exception e)

            {
                System.out.print(e);
            }
        }
    }

public static void main(String args[])
{
demo obj = new demo();
obj.func();
Thread th = new Thread(obj);
th.start();
}
}