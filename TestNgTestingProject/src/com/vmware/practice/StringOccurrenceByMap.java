package com.vmware.practice;

import java.util.HashMap;
import java.util.Map;

public class StringOccurrenceByMap {
	public static void main(String[] args) {
		String str = "moulyamou";
		int j = 1;
		char[] ch = str.toCharArray();
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		
		for(char i :ch)
		{
			if(map.containsKey(i))
			{
				int val = map.get(i);
				map.put(i, val+1);
				
			}
			else
			{
				map.put(i, j);
				
			}
			System.out.println(map+"->");
		}
		System.out.println(map);
		
	}

}
