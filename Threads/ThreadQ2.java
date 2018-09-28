package Threads;

public class ThreadQ2 implements Runnable 
{
	@Override
	public void run() {
		for(int i=1;i<15;i++)
		{
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i + " " + Thread.currentThread().getName());
		}
		
		
	}

	public static void main(String args[])
	{
		ThreadQ2 th = new ThreadQ2();
		Thread t = new Thread(th);
		Thread t1 = new Thread(th);
		t1.setName("Thread1");
		t.start();
		t1.run();
		
		
		
	}
	

	
	

}
