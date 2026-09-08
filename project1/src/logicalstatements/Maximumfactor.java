package logicalstatements;

import java.util.Scanner;

public class Maximumfactor{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("maximum factor ");
		int n=sc.nextInt();
		int maxFactor=1;
		for(int i=1;i<=n/2; i++) {
			if(n%i==0) {
				maxFactor=i;
			}
		}
		System.out.println("Maximumfactor:="+maxFactor);

		

	}

}
