package com.vmware.practice;

import java.util.ArrayList;
import java.util.List;

public class Mssip {
	public static void main(String[] args) {
		String str = "msipsip";
		//output msip
		List<Character> list = new ArrayList<Character>();
		for(int i=0;i<=str.length()-1;i++)
		{
			if(list.contains(str.charAt(i)))
			{
				System.out.println(str.charAt(i)+" is duplicate element");
			}
			else
			{
				list.add(list.size(), str.charAt(i));
			}
		}
		System.out.println(list);
	}
}
