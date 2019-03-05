package com.vmware.practice;

import java.util.HashMap;
import java.util.Map;

public class MapInterface {
	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(1,"abc");
		map.put(12,"fbc");
		map.put(13,"gbc");
		map.put(14,"sdbc");
		
		for(Map.Entry<Integer, String> entry : map.entrySet())
		{
			System.out.println(entry.getKey());
		
			System.out.println("key is "+entry.getKey()+" "+"value is "+entry.getValue());
			System.out.println(entry.setValue("mmm"));
		}
		
	
	}

}
