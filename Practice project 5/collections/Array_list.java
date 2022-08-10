package collections;

import java.util.ArrayList;


public class Array_list{

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		System.out.println("Size:"+list.size());
		
		list.add("Ram");
		list.add("Thomas");
		list.add("Mohan");
		list.add("Ram");
		list.add(null);
		
		System.out.println("After adding elements in list : "+list.size());
		System.out.println(list);
		
		System.out.println(list);
		
		System.out.println("does the List contains Ram? "+list.contains("Ram"));

		list.remove(0);
		list.remove(null);
		
		System.out.println(list);
	}

}
