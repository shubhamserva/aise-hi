package Threads;

public class Thread1 extends Thread
{
	public void run() {
			for(int i=1;i<=10;i++)
			{

				try {
					Thread.sleep(400);
				} 
				catch (InterruptedException e) 
				{
					
					e.printStackTrace();
				}
				System.out.println(i + Thread.currentThread().getName());;
			}
		}
	
	public static void main(String args[])
	{
		Thread1 t1 = new Thread1();
		Thread1 t2 = new Thread1();
		t1.setName("By Thread1");
		t2.setName("By Thread2");
		
		t1.start();
		/*try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		t2.start();
	}
	

}
