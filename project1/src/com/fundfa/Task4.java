package com.fundfa;

public class Task4 {
  static Task4 h = new Task4();
	
	
	static void method1() {
		 int a=10, b=20;
		System.out.println("method1="+(a+b));
		method2();
			
		}
	static void method2() {
		int a=20, b=30;
		System.out.println("method2="+(a-b));	
		h.method3();
	}
	void method3() {
		int a=30, b=40;
		System.out.println("method3="+(a*b));
		h. method4();
	}
	void method4() {
		int a=30, b=40;
		System.out.println("method4="+(a/b));
	}
	
	

	public static void main(String[] args) {
		method1();
		

	}

}
