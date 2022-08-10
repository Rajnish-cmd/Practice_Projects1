package collections;

import java.util.Vector;

public class Vector_ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Vector<String> list= new Vector<String>();
		
		
		
		System.out.println("Size:"+list.size());
		
		list.add("Naman");
		list.add("Vishnu");
		list.add("Naman");
		list.add("Azim");// duplicate value are allowed in list
		list.add(null);// list contains null value
		
		System.out.println("After Adding an Elements :"+list.size());
		System.out.println(list);
		
		System.out.println("Element at index 4: "+list.get(4));
		list.add("Pizza");
		
		System.out.println(list);
		
		System.out.println("List Contains Azim? :"+list.contains("Azim"));
		
		
		list.remove(2);
		list.remove(null);
		
		System.out.println(list);
		

	}

}
