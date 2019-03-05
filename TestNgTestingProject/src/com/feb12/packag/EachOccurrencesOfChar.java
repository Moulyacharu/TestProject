package com.feb12.packag;

import java.util.HashMap;
import java.util.Map;

public class EachOccurrencesOfChar {
	public static void main(String[] args) {
		String str = "moulyamoucharm";
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < str.length(); i++) {
			if (map.containsKey(str.charAt(i))) {
				int value = map.get(str.charAt(i));
				map.put(str.charAt(i), value + 1);
			} else {
				map.put(str.charAt(i), 1);
			}

		}
		System.out.println(map);
	}
}
