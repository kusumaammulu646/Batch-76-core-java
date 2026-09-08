package examples1;
import java.util.Scanner;
public class Mobilephone {
	//Mobile Brand Description

	// Samsung
	// Apple
	// OnePlus
	// Xiaomi
	// Vivo
	//Default → Invalid brand

	public static void main(String[] args) {
		String yn = "";
		
do {
	System.out.println("wlcome to mobiles brand");
	Scanner sc = new Scanner(System.in);
	System.out.println("enter a mobile brand");
	String mobile=sc.nextLine();
	switch(mobile) {
	case "1" -> System.out.println("samsung");
	case "37" -> System.out.println("Apple");
	case "44" -> System.out.println("OnePlus");
	case "55" -> System.out.println(" Xiaomi");
	case "66" -> System.out.println("Vivo");
	default -> System.out.println("enter the mobile brand is not available");
	}
	System.out.println("Do You want to Continue ..? Click Y for Yes or N for No");
	yn = sc.next();
} while (yn.equalsIgnoreCase("y"));
	

	}
}



		

	


