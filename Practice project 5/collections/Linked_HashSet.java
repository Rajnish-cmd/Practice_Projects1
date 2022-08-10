package collections;

import java.util.LinkedHashSet;

public class Linked_HashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedHashSet<String> linkedset= new LinkedHashSet<String>();

System.out.println("linkedset Size before adding : "+linkedset.size());
		
		linkedset.add("A");
		linkedset.add("B");
		linkedset.add("C");
		linkedset.add("D");
		
		
		linkedset.add("A");
		linkedset.add("E");
		linkedset.add(null);
		
		System.out.println("Size after adding elements : "+linkedset.size());
		
		System.out.println(linkedset);
		
		
		System.out.println("Contains E: "+linkedset.contains("C"));
		
		linkedset.remove(null);
		
		System.out.println("After Removing null : "+linkedset);
		

	}

}
