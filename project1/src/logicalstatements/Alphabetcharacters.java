package logicalstatements;

import java.util.Scanner;

public class Alphabetcharacters {
   static void findAlpha() {
	   char c ='A';
	   for(int i=1;i<=26;i++) {
			 if(i%2==0) {
			 System.out.println(i+" "+c);
			
			 }
			 c++;
		 }
	   
   }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		findAlpha();
		
		 
	}
}
 
			 
			 
			 
			 
		 
		 
		
		
		
	


