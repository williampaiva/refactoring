package com.william.mo631.refactoring.sample;

public class InnerMethod {
	public int sum(int a, int b) {
		return soma(a,b);
	}
	
	private int soma(int a, int b) {
		return a + b;
	}
	
	public static void main(String[] args) {
		InnerMethod refactoringInnerMethod = new InnerMethod();
		
		System.out.println(refactoringInnerMethod.sum(2, 2));
	}
}
