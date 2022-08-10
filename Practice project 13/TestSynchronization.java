

public class TestSynchronization {
	
	public static void main(String[] args) {
		
		Sender sender = new  Sender();
		
		User t1= new User("Abhijeet", "Hello Good morning....!", sender);
		User t2= new User("Ankit","Hi! how  are you my boy?",sender);
		
		t1.start();
		t2.start();
	}

}