


class RunnableInterface1 implements Runnable {

	public void run()
	{
		System.out.println("Thread is created using Runnable interface");
	}
	public static void main(String[] args)
	{
		RunnableInterface1 obj = new RunnableInterface1();
		Thread myThread = new Thread(obj);
		myThread.start();
	}
}
