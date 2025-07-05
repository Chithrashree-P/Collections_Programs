package com.listBsed;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CArrayDeque {
	public static void main(String[] args) {
		ArrayDeque a = new ArrayDeque();
		a.add(20);
		a.add(40);
		a.add(2);
		a.add("abc");
		// heterogenous data
		System.out.println(a);
		// Initial capacity 10
		//order of insertion preserves
		// constructors 3
		// duplicates allowed
		a.add(50);
		a.add(50);
		System.out.println(a);
		// Data structure Linear, resizable
		//Methods
		LinkedList a1 = new LinkedList();
		a1.add(2);
		a1.add(3);
		//a.addAll(a1);;
		System.out.println(a);
		a1.retainAll(a); // retain common elements
		System.out.println(a1);
		
		a.removeAll(a1);// removes common elements
		System.out.println(a);
		 System.out.println("----------------");
		// delete data and insert
		System.out.println(a1.set(0, 100));
		
		System.out.println("-----------");
		//System.out.println(a.get(1));
		//not in arrayDeque
		
		System.out.println(a.size());
//		a1.clear();
//		System.out.println(a1);
		
		System.out.println(a.contains(80));
		
		//System.out.println(a.indexOf(50));
		//not in arrayDeque
		
	    System.out.println(	a.remove(0)); //remove data without shifting
	    System.out.println(a);
	    
	    a1.toArray();
	    System.out.println(a1);//linkedlist to array
	    
	    
	    //linkedlist methods
	    System.out.println("linkedlist methods");
	   System.out.println(a.peekFirst());
	   System.out.println(a.peekLast());
	   System.out.println(a.pollFirst());
	   System.out.println(a.pollLast());
	   System.out.println(a);
	   
	   
	   a.addFirst(44);
	   System.out.println(a);
	   a.addLast(57);
	   System.out.println(a);
	   System.out.println(a.getFirst());
	   System.out.println(a.getLast());
	   System.out.println("__________________________");
	    System.out.println(a1.getClass());
	    
	    //for loop not works because non-index based
//	    for (int i = 0; i < a.size(); i++) {
//			System.out.println(a.get(i)); 
//		 accessing - visiting every location and fetches data
//		}
	    
	    for(Object al :a) {
	    	System.out.println(a);
	    }
	    System.out.println("-------------------");
	    Iterator itr = a.iterator();
	    while(itr.hasNext()) {
	    	System.out.println(itr.next());
	    }
	    System.out.println("------------------");
//	    ListIterator itr1 = a.listIterator();
//	    while(itr1.hasNext()) {
//	    	System.out.println(itr1.next());// Forward accessing
//	    	//a.add(5); fail fast
//	    } 
	    // not works in arraylist
	    System.out.println("----------------------");
	    Iterator i1 = a.descendingIterator();
	    while(i1.hasNext()) {
	    	System.out.println(i1.next());//for backward accessing
	    }
	    System.out.println("________________________");
	    
	    
	    
	}

}
