package com.objceoriented;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

import org.testng.annotations.Listeners;

@Listeners(ListenersClass1.class)
public class MouPrograms implements InterfaceClass {

	List<Integer> resList = new ArrayList<Integer>();

	@Override
	public void timeEffecient() {
		int[] arr = { 0, 2, 3, 1, 4, 5, 0, 0, 3, 0, 1 };
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				resList.add(0, 0);
			} else {
				resList.add(resList.size(), arr[i]);
			}
		}
		System.out.println("result is " + resList);
	}

	@Override
	public void middleIndex() {
		int[] arr = { 23, 55, 67, 78, 12, 11, 10 };
		int largest = (arr.length - 1);
		int lowest = 0;
		int mid = (lowest + largest) / 2;
		System.out.println("middle index is " + mid);
		System.out.println("middle  value is " + arr[mid]);
	}

	@Override
	public void removeDuplicates() {
		int[] arr = { 1, 1, 2, 3, 4, 4, 3, 5, 6, 7 };
		List<Integer> resList = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (resList.contains(arr[i])) {
				System.out.println(arr[i] + " is duplicate");
			} else {
				resList.add(resList.size(), arr[i]);
			}
		}
		System.out.println("list values are " + resList);

	}

	@Override
	public void fibonacci() {
		int k = 0, a = 1, b = 1;
		System.out.print("fibonacci values are : ");
		while (k <= 50) {
			k = a + b;
			System.out.print(k + " ");
			a = b;
			b = k;
		}
		System.out.print("\n");
	}

	@Override
	public void duplicateInString() {
		String str = "mssipi";
		List<Character> resList = new ArrayList<Character>();
		for (int i = 0; i < str.length(); i++) {
			if (resList.contains(str.charAt(i))) {
				System.out.println(str.charAt(i) + " " + "is duplicate element");
			} else {
				resList.add(resList.size(), str.charAt(i));
			}
		}
		System.out.println(resList);

	}

	@Override
	public void leastDiff() {
		int[] arr = { 32, 56, 78, 98, 34, 65 };
		int minDiff = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				int diff = arr[j] - arr[i];
				if (diff > 0 && diff < minDiff) {
					minDiff = diff;
				}
			}
		}
		System.out.println("least difference is " + minDiff);
	}

	@Override
	public void topTwoMaximumNumbers() {
		int arr[] = { 2, 6, 1, 8, 3, 9, 0, 4 };
		int firstLar = 0;
		int secLar = 0;

		for (int i = 0; i < arr.length; i++) {
			if (firstLar < arr[i]) {
				secLar = firstLar;
				firstLar = arr[i];
			} else if (secLar < arr[i]) {
				secLar = arr[i];
			}

		}
		assertNotEquals(firstLar, secLar);
		System.out.println("first largest is: " + firstLar);
		System.out.println("second largest is: " + secLar);
	}

	@Override
	public void reverseNumber() {
		int arr = 234;
		String temp = " ";
		String arrString = Integer.toString(arr);
		for (int i = 0; i < arrString.length(); i++) {
			temp = arrString.charAt(i) + temp;
		}
		System.out.println("reverse of given number is: " + temp);
	}

	@Override
	public void palindromeString() {
		String temp = " ";
		StringBuffer str1 = new StringBuffer("malayalam");
		StringBuffer str = str1.reverse();
		for (int i = 0; i < str.length(); i++) {
			temp = str.charAt(i) + temp;
		}
		assertEquals(temp, str + " ");
		System.out.println("given string is palindrome");
	}

	@Override
	public void bubbleSort() {
		int[] arr = { 5, 4, 6, 7, 2, 1, 8, 9, 0 };
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] > arr[i]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		System.out.print("sorted elements are: ");
		for (int k : arr) {
			System.out.print(k + " ");
		}

	}

	@Override
	public void thirdLargetsNumber() {
		int arr[] = { 2, 6, 1, 8, 3, 9, 0, 4 };
		int firstLar = 0;
		int secLar = 0;
		int thirdLargest = 0;

		for (int i = 0; i < arr.length; i++) {
			if (firstLar < arr[i]) {
				thirdLargest = secLar;
				secLar = firstLar;
				firstLar = arr[i];

			} else if (secLar < arr[i]) {
				secLar = firstLar;
				secLar = arr[i];
			} else if (thirdLargest < arr[i]) {
				thirdLargest = arr[i];
			}

		}
		System.out.println("");
		System.out.println("third largest is: " + thirdLargest);
	}

	@Override
	public void countEachoccurrences() {
		String str = "moulyamoulyacharu";
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < str.length(); i++) {

			if (map.containsKey(str.charAt(i))) {
				int temp = map.get(str.charAt(i));
				map.put(str.charAt(i), temp + 1);
			} else {
				map.put(str.charAt(i), 1);
			}
		}
		System.out.println(map);
	}

	@Override
	public void binaryOrNot() {
		int num = 101110;
		boolean value = true;

		while (num != 0) {
			int temp = num % 10;
			if (temp > 1) {
				value = false;
				break;
			} else {
				num = num / 10;
			}
		}
		if (value)
			System.out.println("given number is binary");
		else
			System.out.println("given number is not binary");
	}

	public void displayWithOutSet() {
		int[] arr = { 1, 1, 2, 2, 3, 4, 4, 5, 6, 6, 7 };
		Set<Integer> resset = new HashSet<Integer>();
		for (int i = 0; i < arr.length; i++) {
			resset.add(arr[i]);
		}
		for (int j : resset) {
			System.out.print(j + " ");
		}

	}

	@Override
	public void reverseEachWordInSenten() {
		String str = "today is sunday";

		String[] strSplit = str.split(" ");
		for (int i = 0; i < strSplit.length; i++) {
			StringBuffer sb = new StringBuffer(strSplit[i]);
			System.out.print(sb.reverse() + " ");

		}
		System.out.println();
	}

	@Override
	public void iterateSet() {
		// TODO Auto-generated method stub
		Set<Integer> set = new HashSet<Integer>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		set.add(6);

		Iterator i = set.iterator();
		while (i.hasNext()) {
			System.out.print(i.next() + " ");
		}
		System.out.println();
		for (int j : set) {
			System.out.print(j + " ");
		}

	}

	@Override
	public void iterateList() {
		// TODO Auto-generated method stub
		List<Integer> resList = new ArrayList<Integer>();
		resList.add(1);
		resList.add(2);
		resList.add(3);
		resList.add(4);
		resList.add(5);
		resList.add(6);

		for (int i : resList) {
			System.out.print(i);
		}

		/*
		 * ListIterator k = (ListIterator) resList.iterator(); while(k.hasPrevious()) {
		 * System.out.println(k.previous());
		 */
	}

	@Override
	public void iterateMap() {
		// TODO Auto-generated method stub
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("a", 1);
		map.put("b", 1);
		map.put("c", 1);
		map.put("d", 1);
		System.out.println(map.keySet());
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getValue());
			System.out.println(entry.getKey());
		}
	}

}
