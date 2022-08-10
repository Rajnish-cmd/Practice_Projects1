package collections;

import java.util.LinkedList;

public class Linked_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
LinkedList<Integer> list= new LinkedList<Integer>();
		
		list.add(10);
		list.add(14);
		list.add(18);
		list.add(21);
		
		System.out.println("Size: "+list.size());
		System.out.println(list);
		
		list.remove(3);
		
		System.out.println(list);
		
		System.out.println("Element at index 2 : "+list.get(2));
		list.add(2,0);
		
		System.out.println(list);
		
		System.out.println("First Element: "+list.getFirst());
		
		System.out.println("Last Element: "+list.getLast());
		
		
		
		
	}




	}


