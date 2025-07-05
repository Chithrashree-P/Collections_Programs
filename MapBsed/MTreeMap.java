package com.MapBsed;

import java.util.Iterator;
import java.util.TreeMap;
import java.util.TreeSet;

public class MTreeMap {
	public static void main(String[] args) {
		TreeMap ts = new TreeMap();
		ts.put(1,"vinutha");
		ts.put(2, "sanjay");
		ts.put(5, "harshi");
		System.out.println(ts);//sorted order
		// keys cannot be duplicate
		// values can be duplicate
		
		System.out.println(ts.firstKey());
		System.out.println(ts.firstEntry());
		System.out.println(ts.lastKey());
		System.out.println(ts.lastEntry());
		System.out.println("--------------------------");
		System.out.println(ts.headMap(2));//elements before 75
		System.out.println(ts.tailMap(2));// elements after 75 including 75
		System.out.println(ts.headMap(2, true));
		System.out.println(ts.tailMap(2, false));
		
		System.out.println("--------------------");
		System.out.println(ts.subMap(1, 5));
		System.out.println("-----------------------");
		
		System.out.println(ts.ceilingKey(2));//data is present returns
		System.out.println(ts.ceilingEntry(2));
		//data is not present returns higher data
		
		System.out.println("------------------------");
		System.out.println(ts.floorEntry(2));
		System.out.println(ts.floorKey(2));
		//data is present returns
		
		
		
		System.out.println("----------------------");
		System.out.println(ts.higherKey(2));
		//always returns highest data whether the data is present or not
		System.out.println(ts.lowerKey(3));
		//always returns lowest data whether the data is present or data
		System.out.println(ts.higherEntry(2));
		System.out.println(ts.lowerEntry(2));
		
		
		System.out.println("------------Accessing-------------");
		
		
		
		
		
	}
}
