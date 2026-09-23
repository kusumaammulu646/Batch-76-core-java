package logicalstatements;

import java.util.Scanner;

public class Magicornot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int num=123456;
		while(n>9) {
			int sum=0;
		
		while(n>0) {
			int x=n%10;
			n=n%10;
			sum+=x;
		}
		num=sum;
		
		
		if(num==1) {
		System.out.println("given one magic");
	}else {
		System.out.println("given one  not magic");
	}
		}
	}
}
