package com.vmware.practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListInterface {
public static void main(String[] args) {
	List<String> str = new ArrayList<String>();
	str.add("abc");
	str.add(1, "bcd");
	str.add("xtr");
	str.add("ggg");
	str.add(3, "mmm");
	System.out.println(str);
	ListIterator it = str.listIterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	
	while(it.hasPrevious())
	{
		System.out.println(it.previous());
	}
}
}
