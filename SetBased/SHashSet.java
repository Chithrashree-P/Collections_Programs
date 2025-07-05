package com.SetBased;

import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.TreeSet;

public class SHashSet {
	public static void main(String[] args) {
		HashSet ts = new HashSet();
		ts.add(100);
		ts.add(150);
		ts.add(50);
		ts.add(25);
		ts.add(75);
		ts.add(125);
		ts.add(175);
		System.out.println(ts);//sorted order
		
		
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
		
//		ListIterator i = ts.listIterator();
//		while(i.hasNext()) {
//			System.out.println(i.next());
//			// backward accessing
//		}
		
	}
}
