package com.vmware.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountOccurrences {
	public static void main(String[] args) {
		int n = 0;
		String temp = "moulyamoul";
		ArrayList<Character> resstr = new ArrayList<Character>();
		
		char[] arr = temp.toCharArray();
			for(Character j: arr)
		{
				if (resstr.contains(j)) 
				{
					n++;
					temp = temp + j;
				}
				else
				{
					resstr.add(resstr.size(), j);
				}
		}
	System.out.println(resstr);
	}

}
