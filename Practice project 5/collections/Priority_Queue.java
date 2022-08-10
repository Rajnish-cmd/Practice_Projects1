package collections;

import java.util.PriorityQueue;

public class Priority_Queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

PriorityQueue<Integer> pQueue= new PriorityQueue<Integer>(); 
		
		pQueue.add(17);
		pQueue.add(15);
		pQueue.add(45);
		pQueue.add(22);
	 
		System.out.println(pQueue);
		
		
		System.out.println("Top Element: " + pQueue.peek());
		
		
		//printing the top element and removing it from the priority queue container
		System.out.println("Printing the top element and removing: "+pQueue.poll());
		System.out.println(pQueue);
		
		
		System.out.println("Top Element: " + pQueue.peek());
		
		pQueue.remove(22);
	
		
		System.out.println("After Removing 22 : "+pQueue);
	}

}
