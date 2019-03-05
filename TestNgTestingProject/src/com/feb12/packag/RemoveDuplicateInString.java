package com.feb12.packag;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicateInString {
	public static void main(String[] args) {
		String str = "msipsip";
		//output = msip;
		
		List<Character> list = new ArrayList<Character>();
		
		for(int i=0;i<str.length();i++)
		{
			if(list.contains(str.charAt(i)))
			{
				System.out.println(str.charAt(i) +" is duplicate");
			}
			else
			{
				list.add(list.size(), str.charAt(i));
			}
		}
		System.out.println(list);
		
	}

}
