package com.fundfa;

public class Garbage {
	int a=100;
	void hello() {
		System.out.println("hi good mrng");
		
		Garbage u=new Garbage ();

		
	}
	@Override
	protected void finalize() throws Throwable{
		System.out.println("finalized invoked");
	}
	
	

	public static void main(String[] args) {
		Garbage u1=new Garbage ();
		Garbage u2=new Garbage ();
		Garbage u3=new Garbage ();
		
		
		// nullifyigg objects
		
		u1=null;
		
		//re-assinging objects
		
		Garbage u4=new Garbage ();
		u4=u2;
		//anonymous object
		//method inside object
		new Garbage().hello();
		System.gc();
		System.out.println(u1);
		System.out.println(u2);
		System.out.println(u3);
		System.out.println(u4);
		
		

		
		

	}

}
