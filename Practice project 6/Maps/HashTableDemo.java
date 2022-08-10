

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashTableDemo {

	
	public static void main(String[] args) {
		
		Hashtable<Integer, String>  map= new Hashtable<Integer, String>();
		
		
		map.put(1, "Ankit");
		map.put(2, "Dilip");
		
		map.put(3, "ALex");
		
		
		map.put(5, "Pandey");
		
		
		System.out.println(map);
		System.out.println("Get element at key 3: "+map.get(3));
		
		System.out.println("Get element at key 5: "+map.get(5));
		
		System.out.println("Get element at key 8: "+map.get(8));
		
		
		
		System.out.println("Get element at key 6: "+map.get(6));
		
		
		
		map.remove(5);
		
		System.out.println(map);
		
		
		
		for(Map.Entry m: map.entrySet()) {
			
			System.out.println(m.getKey()+" , "+m.getValue());
		}		
		
		
		
		
	}
}