 
class thread1 extends Thread
{
	public void run()
	{
		try
		{
			for(int i=1;i<=15;i++)
			{
				System.out.println("Raman...."+i);
				sleep(1000);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
class thread2 extends Thread
{
	public void run()
	{
		try
		{
			for(int j=60;j<=100;j=j+2)
			{
				System.out.println(j+"....manisha");
				sleep(500);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	public static void main(String args[])
	{
		thread1 th1 = new thread1();
		thread2 th2 = new thread2();
		th1.start();
		th2.start();
	}


		}		
	
