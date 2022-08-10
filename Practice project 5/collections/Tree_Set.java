package collections;

import java.util.Set;
import java.util.TreeSet;


public class Tree_Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Set<String> set = new TreeSet<String>(); 
		
		set.add("ram");
		set.add("mohan");
		set.add("naman");
		set.add("naman");
		//set.add(null);
		
		System.out.println(set);
		
		System.out.println("Size: "+set.size());
		
		System.out.println("Contains: "+ set.contains("Ram"));

	}

}
