package com.vmware.practice;

import java.util.HashMap;
import java.util.Map;

public class MapPract {
	public static void main(String[] args) {
		Map<Integer,String> resMap = new HashMap<Integer,String>();
		resMap.put(10, "aaa");
		resMap.put(13, "ddd");
		resMap.put(14, "eee");
		resMap.put(15, "fff");
		resMap.put(null, "ggr");
		resMap.put(null, "jkj");
		//resMap.put(null, "sss");
		//resMap.put(null, "rrr");
		
		  for(Map.Entry<Integer, String> entry : resMap.entrySet())
		  {
		  System.out.println(entry.getKey()+" "+entry.getValue());
		  }
		 		
	
		
	}
}
