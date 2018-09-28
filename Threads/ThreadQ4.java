package Threads;

public class ThreadQ4 implements Runnable  
{
	@Override
	public void run() 
	{
		try {
			Thread.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("I m  ");
		System.out.println(Thread.currentThread().getName());
		
		
	}

	public static void main(String[] args) 
	{
		ThreadQ4  q1= new ThreadQ4();
		Thread t1 = new Thread(q1);
		Thread t2 = new Thread(q1);
		t1.setName("Person 1");
		t2.setName("Person2");
		t1.start();
		t2.start();
		t1.setPriority(10);
		
		
	

	}


}
