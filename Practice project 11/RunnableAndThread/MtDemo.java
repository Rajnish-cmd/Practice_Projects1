
public class MtDemo extends Thread{
public void run() {
	System.out.println("You are in thread");
}
public static void main(String[] args) {
	MtDemo obj=new MtDemo();
	obj.start();
}
}
