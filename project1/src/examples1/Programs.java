package examples1;
import java.util.Scanner;

public class Programs {
	//Programming Language
	//1 → Java
	//2 → Python
	//3 → C
	//4 → C++
	//5 → JavaScript

	public static void main(String[] args) {
		String yn = "";
		
		do {
			System.out.println("wlcome to Programming Language");
			Scanner sc = new Scanner(System.in);
			System.out.println("enter a Programming Language");
			String mobile=sc.nextLine();
			switch(mobile) {
			case "1" -> System.out.println("Java");
			case "37" -> System.out.println(" Python");
			case "44" -> System.out.println("C");
			case "55" -> System.out.println("C++");
			case "66" -> System.out.println("JavaScript");
			default -> System.out.println("enter one is not available");
			}
			System.out.println("Do You want to Continue ..? Click Y for Yes or N for No");
			yn = sc.next();
		} while (yn.equalsIgnoreCase("y"));
			

			}
		


	}


