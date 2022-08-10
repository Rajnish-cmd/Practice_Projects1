
public class ConstructorTypes {


	int Rollno;
	String name;
	String city;
	String Branch;
	
	
	
	//Default Constructor
	public ConstructorTypes() {
		Rollno=77;
		name="Ram";
		city="Delhi";
		Branch="EC";
		
		System.out.println("This is default Constructor");
	}
	
	//Parameterized Constructor
	public ConstructorTypes(int EmployeeId,String Name,String Address,String Stream) {
		this.Rollno=EmployeeId;
		this.name=Name;
	     this.city=Address;
		this.Branch=Stream;
	}
	
	public void display()
	{
		System.out.println(Rollno+" "+ name+" "+city+" "+Branch);
	}
	
	
	public static void main(String args[]) {
		ConstructorTypes obj=new ConstructorTypes();
		obj.display();
		ConstructorTypes obj2=new ConstructorTypes(66,"Naman","Pune","CS");
		obj2.display();
	}

}

