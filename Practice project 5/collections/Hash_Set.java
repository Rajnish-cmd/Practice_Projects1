package collections;

import java.util.HashSet;


public class Hash_Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet<Integer> set= new HashSet<Integer>();

System.out.println("Size of Hashset before adding elements: "+set.size());
		
		set.add(96);
		set.add(14);
		set.add(12);
		set.add(37);
		set.add(77);
		set.add(77);
		set.add(null);
		
		System.out.println("Size: "+set.size());
		
		System.out.println(set);
		
		System.out.println("Contains: "+ set.contains(12));
		
		set.remove(null);
		System.out.println("HAshset after removing null: "+ set);
		
		
		
	}

}


	