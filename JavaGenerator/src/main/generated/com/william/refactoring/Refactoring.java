package com.william.refactoring;

public class Refactoring {
	public int num1;
	public int num2;

	public int sum(int a, int b) {
		System.out.println("test modisco");
		return soma(num1, num2);
	}

	private int soma(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
		Refactoring refactoring = new Refactoring();
		refactoring.num1 = 2;
		refactoring.num2 = 2;
		System.out.println(refactoring.sum(2, 2));
	}

}
