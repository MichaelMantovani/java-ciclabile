package org.java;

public class Main {
	public static void main(String[] args) {
		int[] rdnNumbers = new int[3];
		rdnNumbers[0] = 1;
		rdnNumbers[1] = 2;
		rdnNumbers[2] = 3;
		Numbers numbers = new Numbers(rdnNumbers);
		System.out.println(numbers);
		
		System.out.println(numbers.getElementoSuccessivo());
		
		System.out.println(numbers.getElementoSuccessivo());
		
		System.out.println(numbers.getElementoSuccessivo());
		
		System.out.println(numbers.getElementoSuccessivo());
		
		System.out.println(numbers.getElementoSuccessivo());
		
		System.out.println(numbers.getElementoSuccessivo());
	}
}
