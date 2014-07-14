package com.superclass;

public class ClassA {
	public void method1() {
		SubClassA sca = new SubClassA();
		sca.method1(1,2,3);
		
		SubClassA sca2 = new SubClassA();
		sca2.method1(4,5,6);
		
		System.out.println(sca.getA());
		System.out.println(sca.getB());
		System.out.println(sca.getC());
		
		System.out.println(sca2.getA());
		System.out.println(sca2.getB());
		System.out.println(sca2.getC());
	}
}
