

public class ThreadDemo2 implements Runnable {
	
	
	public  void run() {
		
		for(int i=1; i<5; i++) {
			
			System.out.println(i+ " "+Thread.currentThread().getName());
		
			 try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
		 
	}
	
	
	public static void main(String[] args) {
		
		ThreadDemo2 obj= new ThreadDemo2();
		ThreadDemo2 obj1= new ThreadDemo2();
			Thread t1=new  Thread(obj);
		Thread t2=new  Thread(obj1);
		
		t1.setName("First");
		t2.setName("Second");
	
		t1.start();
		t2.start();
	}

}