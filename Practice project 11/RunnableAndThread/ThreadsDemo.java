

class ThreadsDemo extends Thread {

	public void run()
	{
		System.out.println(
			"Thread is running created by extending to parent Thread class");
	}

	public static void main(String[] args)
	{

		ThreadsDemo myThread = new ThreadsDemo();
	
		myThread.start();
	}
}
