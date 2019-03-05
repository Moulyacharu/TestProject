package com.vmware.practice;

import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;

public class SetInterface {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("abc");
		set.add("yte");
		set.add("uyt");
		set.add("rgt");
		set.add("hjh");
		
		System.out.println(set);
		
		Iterator ite = set.iterator();
		while(ite.hasNext())
		{
			System.out.println(ite.next());
		}
	}

}
