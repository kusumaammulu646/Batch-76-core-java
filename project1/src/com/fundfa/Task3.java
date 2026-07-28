package com.fundfa;

public class Task3 {
	static Task3 n = new Task3();
	
	static void Method1() {
		Method2();
		System.out.println("method 1");
	}
	static void Method2() {
		 n.Method3();
		System.out.println("method 2");
	}
	void Method3() {
		n.Method4();	
		System.out.println("method 3");
		}
	void Method4() {
		System.out.println("method 4");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method1();
		
	}

}
