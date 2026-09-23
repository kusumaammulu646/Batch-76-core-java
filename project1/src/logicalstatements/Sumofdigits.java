package logicalstatements;

import java.util.Scanner;

public class Sumofdigits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int sum=0;
		int postion=0;
		while(n>0) {
			n=n/10;
			int digit= n%10;
			if(postion%2==0) {
			sum=sum+digit;
			n=n/10;
			postion++;	
		}
		System.out.println("sum:="+sum);
		
	}

}
}
