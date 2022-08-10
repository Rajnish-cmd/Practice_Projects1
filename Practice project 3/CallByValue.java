package calling;

public class CallByValue {
int num=60;
	
	void operation(int num) {
		this.num=num*10/100;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CallByValue obj=new CallByValue();
		System.out.println(obj.num);
		obj.operation(15);
		System.out.println(obj.num);

	}

}
