package logicalstatements;

import java.util.Random;
import java.util.Scanner;

public class Gameprojecttask {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Random r=new Random();
		int radomnumber=r.nextInt(10)+1;
		for(int i=1;i<=3;i++) {
		System.out.println("enter the guess");
		int userinput=sc.nextInt();
		if(userinput==radomnumber) {
			System.out.println("YOU WON");
			break;
		}
		
		
		if(radomnumber==3) {
			System.out.println("wrong guess");
			
		
	}else{
		System.out.println("BETTER LUCK NEXT TIME");
	}
			}
		sc.close();
		
		
	}
}

		

		
		
		
				
		

	




