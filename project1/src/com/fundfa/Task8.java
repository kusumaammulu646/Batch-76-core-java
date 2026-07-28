package com.fundfa;

public class Task8 {
	static String banckname="hdfc";
	int accountnumber;
	int banckbalance;
	
	void deposit(){
		banckbalance =banckbalance+1012;
		System.out.println("accountnumber=:"+accountnumber);
		System.out.println(" afterdeposit=:"+banckbalance);
		
		
	}
	void withdraw() {
		banckbalance =banckbalance-500;
		
		System.out.println("afterwithdraw=:"+banckbalance);
		
	}
	void checkbalance() {
		System.out.println("aftercheckbalance =:"+banckbalance);
		
	}
	
	
	
	public static void main(String[] args) {
		Task8 n= new Task8();
		n. accountnumber=1012;
		n. banckbalance=20000;
		n.deposit();
		n.withdraw() ;
		n.checkbalance();
		
		
		

	}

}
