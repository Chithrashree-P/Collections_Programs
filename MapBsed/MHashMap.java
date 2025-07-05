package com.MapBsed;

import java.util.*;

public class MHashMap {
public static void main(String[] args) {
	HashMap h = new HashMap();
	h.put(10, "sanjay");
	h.put(45, "Rohit");
	h.put(8, "Nitish");
	h.put(6, "Rohit");
	System.out.println(h);//sorted order based on key
	// duplicates keys removes and gives output
	// values can be duplicate
	h.put(5.0, "Vivek");// heterogeneous keys allowed
	h.put(7, 9);// heterogenous data allowed
	System.out.println(h);
	
	System.out.println(h.containsKey(10));//returns boolean value if value is present
	System.out.println(h.containsValue("sanjay"));//returns boolean value if value is present
	h.put(null, "fgfgh");// key can be null, duplicates not allowed
	h.put(9, null);// values can be null, duplicates allowed
	h.put(10.0, null);
	System.out.println(h);
//	h.clear(); clear all the data
//	System.out.println(h);
	System.out.println(h.isEmpty());// returns boolean value
	h.replace(10, "kl");
	System.out.println(h);// replace of value which key is 10
	h.replace(8, "Nitish", "satish");
	System.out.println(h);// replace of value using key and value
	
	System.out.println(h.get(8));//satish
	System.out.println(h.getOrDefault(10, "Not present"));
	// kl
	System.out.println(h.getOrDefault(11, "Not present"));
	// not present
	System.out.println(h.putIfAbsent(10, "kl"));
	System.out.println(h.putIfAbsent(10, "dhoni"));
	
	System.out.println("_______________________");
	Set s = h.keySet();
	System.out.println(s);// returns only keys
	Iterator itr = s.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());// accessing
	}
	System.out.println("______________________________");
	Collection c = h.values();
	System.out.println(c);// returns only values
	Iterator itr1 = c.iterator();
	while(itr.hasNext()) {
		System.out.println(itr1.next());
	}
	System.out.println("___________________________");
	Set s1 = h.entrySet();
	System.out.println(s1);// returns all key-value pair
	System.out.println("__________________________");
	for(Object set: s1) {
		System.out.println(set);// to access the key-value we have to use for-each loop
		// iterator not works
	}
	System.out.println("------------------------");
	
}
}
