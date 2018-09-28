package Threads;

public class ThreadQ5 implements Runnable
{@Override
	public void run() {
	
	
		System.out.println("GOt Ticket" + Thread.currentThread().getName());
	
	
	
}

public static void main(String args[])
{
	ThreadQ5 th = new ThreadQ5();
	Thread t1 = new Thread(th);
	Thread t2 = new Thread(th);
	t1.setName("customer 1");
	t2.setName("Customer 2");
	t1.start();
	t2.start();
	
	
	
}

}
