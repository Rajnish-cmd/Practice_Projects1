package InnErClasses;
public class MethodLocalInnerClass {

	
	public void dispaly() {
		
		class Inner{
			
			int a=10;
			
			void print() 
			{
				System.out.println("Method of inner class");
				System.out.println("Value of a : "+a);
			}
			
		}
		
		Inner inner= new Inner();
		inner.print();
		
		
		
	}
	
	public static void main(String[] args) {
		
		MethodLocalInnerClass outer= new MethodLocalInnerClass();
		outer.dispaly();
		
	}
	
	
}
