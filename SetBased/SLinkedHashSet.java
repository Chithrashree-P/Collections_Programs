package com.SetBased;


import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;

public class SLinkedHashSet {
	public static void main(String[] args) {
		LinkedHashSet ts = new LinkedHashSet();
		ts.add(100);
		ts.add(150);
		ts.add(50);
		ts.add(25);
		ts.add(75);
		ts.add(125);
		ts.add(175);
		System.out.println(ts);//random order
		
		
		System.out.println("------------Accessing-------------");
		// listIterator not works in HashSet 
		//because HashSet  stores data randomly  and doesn't maintains insertion order
		
		for(int i =0; i<ts.size();i++) {
			System.out.println(i);
		}
		for(Object ad : ts) {
			System.out.println(ad);
		}
		System.out.println("-------------");
		
		Iterator c = ts.iterator();
		while(c.hasNext()) {
			System.out.println(c.next());
		}
		System.out.println("--------------------");
		
		
}
}
