package com.feb12.packag;

public class EqualsAndHashCode {
	public static void main(String[] args) {
	String str = "Name";
    String str1 = new String("Name");

		/*
		 * if(str.equals(str1)) System.out.println("true"); else
		 * System.out.println("false");
		 */
		
		  if(str==str1) System.out.println("true"); else System.out.println("false");
		 

   // System.out.println(str.hashCode());
    System.out.println(str1.hashCode());
	}
}
