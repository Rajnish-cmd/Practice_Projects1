

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
	
	public static void main(String[] args) {
		
		
		TreeMap<Integer, String> map= new TreeMap<Integer, String>();
		
		
		
		
		
		map.put(1, "Ankit");
		map.put(2, "Dilip");
		
		map.put(3, "ALex");
		
		map.put(4, null);
		
		map.put(5, "Avinash");
		
		System.out.println(map);
		System.out.println("Get element at key 3: "+map.get(3));
		
		System.out.println("Get element at key 5: "+map.get(5));
		
		System.out.println("Get element at key 4: "+map.get(4));
		
				
		System.out.println("Get element at key 6: "+map.get(6));
		
		
		
		map.remove(5);
		
		System.out.println(map);
		
		
		
		for(Map.Entry m:map.entrySet()) {
			System.out.println(m.getKey()+" , "+m.getValue());
		}
		
		
	}

}