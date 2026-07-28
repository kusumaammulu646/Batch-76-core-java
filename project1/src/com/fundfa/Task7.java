package com.fundfa;

public class Task7 {
	String accountholdername ;
	int balance ;
	   static int accountnumber ;
	 static String ifsc="a2345" ;
	 static String branchname="statebank";
	
	
	{
	accountnumber=accountnumber+1;
	}
	
			
			
				void show() {
				
				System.out.println(" balance =:" + balance  );
				System.out.println(" accountnumber =:"+accountnumber  );
			
				
				System.out.println(" accountholdername=:"+ accountholdername );
				System.out.println(" ifsc =:"+ifsc );
				System.out.println("branchname: ="+ branchname   );
				}
				
				
				public static void main(String[] args) {
					
					Task7 h1 = new Task7 ();
					h1. accountholdername ="kusuma";
					h1. balance =20000;
					 
					 
					h1.show();
					
					Task7 h2 = new Task7 ();
					h2. accountholdername ="kusuma";
					h2. balance =20000;
					 
					 
					h2.show();
					
					
				}
					
				
				
				
				
				
				
				
				
				
				
				
		
	}


