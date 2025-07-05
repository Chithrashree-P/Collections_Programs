package com.SetBased;

import java.util.Iterator;
import java.util.TreeSet;

public class STreeSet {
public static void main(String[] args) {
	TreeSet ts = new TreeSet();
	ts.add(100);
	ts.add(150);
	ts.add(50);
	ts.add(25);
	ts.add(75);
	ts.add(125);
	ts.add(175);
	System.out.println(ts);//sorted order
	
	System.out.println(ts.first());
	System.out.println(ts.last());
	System.out.println(ts.headSet(75));//elements before 75
	System.out.println(ts.tailSet(75));// elements after 75 including 75
	System.out.println(ts.headSet(75, true));
	System.out.println(ts.tailSet(125, false));
	System.out.println("--------------------");
	System.out.println(ts.subSet(75, 125));
	System.out.println("-----------------------");
	System.out.println(ts.ceiling(100));//data is present returns
	System.out.println(ts.ceiling(102));
	//data is not present returns higher data
	System.out.println("------------------------");
	System.out.println(ts.floor(125));
	//data is present returns
	System.out.println(ts.floor(124));
	//data is not present returns lower data
	
	System.out.println("----------------------");
	System.out.println(ts.higher(125));
	//always returns highest data whether the data is present or not
	System.out.println(ts.lower(125));
	//always returns lowest data whether the data is present or data
	
	System.out.println("------------Accessing-------------");
	//traditional for loop and listIterator not works in treSet 
	//because treeSet didnot have get() method
	
	for(Object ad : ts) {
		System.out.println(ad);
	}
	System.out.println("-------------");
	
	Iterator c = ts.iterator();
	while(c.hasNext()) {
		System.out.println(c.next());
	}
	System.out.println("--------------------");
	
	Iterator i = ts.descendingIterator();
	while(i.hasNext()) {
		System.out.println(i.next());
		// backward accessing
	}
	
}
}
