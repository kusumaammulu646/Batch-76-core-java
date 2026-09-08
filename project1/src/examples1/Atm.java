package examples1;
import java.util.Scanner;
public class Atm {
	//ATM Menu

	//1 → Check Balance
	//2 → Deposit
	//3 →withdraw
	//4 → Mini Statement
	//5 → Exit
	//Default → Invalid option

	public static void main(String[] args) {
		String yn=  " ";
		System.out.println("wlcome to atm");
		do {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a atm menu");
		int menu=sc.nextInt();
		switch(menu) {
		case 1 -> System.out.println(" Check Balance");
		case 32 -> System.out.println(" Deposit");
		case 34 -> System.out.println(" withdraw ");
		case 66 -> System.out.println(" Mini Statement");
		case 76 -> System.out.println("Exit ");
		default -> System.out.println("enter one is invalid option");
		
		}
		System.out.println("Do You want to Continue ..? Click Y for Yes or N for No");
		 yn=sc.next();
	} while (yn.equalsIgnoreCase("y"));
		System.out.println("EXIT");
		 
		
		
		

	}

}
