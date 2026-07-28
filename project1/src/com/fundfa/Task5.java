package com.fundfa;

public class Task5 {
	
	static {
		Task5 k= new Task5();
		k.method1();
	}
	
	void method1() {
		method2();
		System.out.println("method1");
	}
		 
	void method2() {
		method3();
		System.out.println("method2");
			
		}
	void method3() {
		method4();
		System.out.println("method3");
			
		}
	void method4() {
		 
		System.out.println("method4");
			
		}
	
	
	


	public static void main(String[] args) {
	System.out.println( "main method started");
	
		

	}

}
