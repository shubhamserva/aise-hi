package Threads;

public class SyncThread extends Thread
{
	 public void run() 
	{
		for(int i=0;i<10;i++)
		{
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}
	
	public static void main(String args[]) 
	{
		SyncThread st1 = new SyncThread();
		SyncThread st2 = new SyncThread();
		
		st1.start();
		st2.start();
	}
	
}


