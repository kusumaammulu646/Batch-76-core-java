package com.fundfa;

public class Cricketer {
	static int countryId;
	static String countryName;
	int jerseyNo;
	String CrickerName;
	public static void main(String[] args) {
		System.out.println("main method started");
		System.out.println("Welcome to Indian Cricket Team Info");
		
		countryId=91;
		countryName="India";
		
		System.out.println("countryId");//0---91
		System.out.println("countryName");//null---India
		
		
		
		System.out.println("object info ************************");
		
		Cricketer rohit = new Cricketer();
		
		System.out.println("countryId:+ countryId");//0-----91
		System.out.println("countryName:+ countryName");//null----India
		
		rohit.jerseyNo=45;
		rohit.CrickerName="rohit sharma";
		System.out.println("jerseyNo:+rohit.jerseyNo" );
		System.out.println("CrickerName:+ rohit.CrickerName");
		
		System.out.println(" ************************");
		
		
		

		System.out.println("object info2 ************************");
		
		Cricketer vk = new Cricketer();
		
		System.out.println("countryId:+ countryId");//0-----91
		System.out.println("countryName:+ countryName");//null----India
		
		vk.jerseyNo=18;
		vk.CrickerName="kohil";
		System.out.println("jerseyNo:+vk.jerseyNo" );
		System.out.println("CrickerName:+ vk.CrickerName");
		
		System.out.println(" ************************");


		
		
		
		
		
		
		
		
		
		
		
		

				
		

	}

}
