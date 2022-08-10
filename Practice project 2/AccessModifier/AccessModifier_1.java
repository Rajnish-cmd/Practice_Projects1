package AccessModifier;

import AccessModifier.AccessModifier_2;

public class AccessModifier_1 {

	public  void PublicMethod() {
		// TODO Auto-generated method stub
		System.out.println("This is the public method");
	}
	private void PrivateMethod() {
		System.out.println("This is the private method");
	}
	protected void ProtectedMethod() {
		System.out.println("This is the Protected Method");
	}
	void defaultMethod() {
		System.out.println("This is the default Method");
	}
	


public static void main(String args[]) {
AccessModifier_1 obj=new AccessModifier_1();
obj.PublicMethod();
obj.PrivateMethod();
obj.defaultMethod();
obj.ProtectedMethod();
}
}
