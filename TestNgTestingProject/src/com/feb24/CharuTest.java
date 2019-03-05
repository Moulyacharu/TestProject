package com.feb24;

public class CharuTest {
	public static void main(String[] args) {
		GetSet g = new GetSet();
		StudentPojo s = new StudentPojo();
		s.setAge(28);
		s.setName("abc");
		s.setId(123);
		g.printStudent(s);
	}
}

class GetSet {
	public void printStudent(StudentPojo student) {
		System.out.println(student.getName());
		System.out.println(student.age);
		System.out.println(student.id);
	}
}
