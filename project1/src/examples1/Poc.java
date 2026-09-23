package examples1;
import java.util.Scanner;
public class Poc {

	public static void main(String[] args) {
		 System.out.println("main method started ");

		        Scanner sc = new Scanner(System.in);

		        String yn = "";
		        double totalPrice = 0;

		        do {

		            System.out.println("Enter Category ..? ");

		            String catg = sc.next();

		            switch (catg) {

		            case "veg" -> {

		                String vyn = "";
		                double totalVegCost = 0;

		                do {

		                    System.out.println("Enter Item : ");

		                    String item = sc.next();

		                    switch (item) {

		                    case "paneer" -> {

		                        System.out.println("Paneer per plate is 150 rs");

		                        double paneerPrice = 150;

		                        totalVegCost = totalVegCost + paneerPrice;
		                    }

		                    case "vegbiryani" -> {

		                        System.out.println("Veg Biryani per plate is 120 rs");

		                        double vegBiryaniPrice = 120;

		                        totalVegCost = totalVegCost + vegBiryaniPrice;
		                    }

		                    case "vegfriedrice" -> {

		                        System.out.println("Veg Fried Rice per plate is 100 rs");

		                        double vegFriedRicePrice = 100;

		                        totalVegCost = totalVegCost + vegFriedRicePrice;
		                    }

		                    case "gobimanchurian" -> {

		                        System.out.println("Gobi Manchurian per plate is 130 rs");

		                        double gobiPrice = 130;

		                        totalVegCost = totalVegCost + gobiPrice;
		                    }

		                    default ->
		                        System.out.println("Entered Item is not available !!");
		                    }

		                    System.out.println(
		                            "Do you want to continue with Veg? Click Y for Yes N for No");

		                    vyn = sc.next();

		                } while (vyn.equalsIgnoreCase("Y"));

		                System.out.println("Your Total Veg Cost is : " + totalVegCost);

		                totalPrice = totalPrice + totalVegCost;

		                System.out.println("Exit From Veg Category !!!");
		            }


		            case "nonveg" -> {

		                String nyn = "";
		                double totalNonVegCost = 0;

		                do {

		                    System.out.println("Enter Item : ");

		                    String item = sc.next();

		                    switch (item) {

		                    case "chickenbiryani" -> {

		                        System.out.println("Chicken Biryani per plate is 220 rs");

		                        double chickenBiryaniPrice = 220;

		                        totalNonVegCost =
		                                totalNonVegCost + chickenBiryaniPrice;
		                    }

		                    case "chicken65" -> {

		                        System.out.println("Chicken 65 per plate is 180 rs");

		                        double chicken65Price = 180;

		                        totalNonVegCost =
		                                totalNonVegCost + chicken65Price;
		                    }

		                    case "muttonbiryani" -> {

		                        System.out.println("Mutton Biryani per plate is 300 rs");

		                        double muttonBiryaniPrice = 300;

		                        totalNonVegCost =
		                                totalNonVegCost + muttonBiryaniPrice;
		                    }

		                    case "fishfry" -> {

		                        System.out.println("Fish Fry per plate is 200 rs");

		                        double fishFryPrice = 200;

		                        totalNonVegCost =
		                                totalNonVegCost + fishFryPrice;
		                    }

		                    default ->
		                        System.out.println("Entered Item is not available !!");
		                    }

		                    System.out.println(
		                            "Do you want to continue with NonVeg? Click Y for Yes N for No");

		                    nyn = sc.next();

		                } while (nyn.equalsIgnoreCase("Y"));

		                System.out.println(
		                        "Your Total NonVeg Cost is : " + totalNonVegCost);

		                totalPrice = totalPrice + totalNonVegCost;

		                System.out.println("Exit From NonVeg Category !!!");
		            }


		            case "starters" -> {

		                String syn = "";
		                double totalStartersCost = 0;

		                do {

		                    System.out.println("Enter Item : ");

		                    String item = sc.next();

		                    switch (item) {

		                    case "chickenlolipop" -> {

		                        System.out.println("Chicken Lollipop is 220 rs");

		                        double chickenLolipopPrice = 220;

		                        totalStartersCost =
		                                totalStartersCost + chickenLolipopPrice;
		                    }

		                    case "springroll" -> {

		                        System.out.println("Spring Roll is 100 rs");

		                        double springRollPrice = 100;

		                        totalStartersCost =
		                                totalStartersCost + springRollPrice;
		                    }

		                    case "paneertikka" -> {

		                        System.out.println("Paneer Tikka is 160 rs");

		                        double paneerTikkaPrice = 160;

		                        totalStartersCost =
		                                totalStartersCost + paneerTikkaPrice;
		                    }

		                    case "chickentikka" -> {

		                        System.out.println("Chicken Tikka is 200 rs");

		                        double chickenTikkaPrice = 200;

		                        totalStartersCost =
		                                totalStartersCost + chickenTikkaPrice;
		                    }

		                    case "gobi65" -> {

		                        System.out.println("Gobi 65 is 130 rs");

		                        double gobi65Price = 130;

		                        totalStartersCost =
		                                totalStartersCost + gobi65Price;
		                    }

		                    default ->
		                        System.out.println("Entered Item is not available !!");
		                    }

		                    System.out.println(
		                            "Do you want to continue with Starters? Click Y for Yes N for No");

		                    syn = sc.next();

		                } while (syn.equalsIgnoreCase("Y"));

		                System.out.println(
		                        "Your Total Starters Cost is : " + totalStartersCost);

		                totalPrice = totalPrice + totalStartersCost;

		                System.out.println("Exit From Starters Category !!!");
		            }


		            case "soups" -> {

		                String ssyn = "";
		                double totalSoupsCost = 0;

		                do {

		                    System.out.println("Enter Item : ");

		                    String item = sc.next();

		                    switch (item) {

		                    case "tomatosoup" -> {

		                        System.out.println("Tomato Soup is 80 rs");

		                        double tomatoSoupPrice = 80;

		                        totalSoupsCost =
		                                totalSoupsCost + tomatoSoupPrice;
		                    }

		                    case "sweetcornsoup" -> {

		                        System.out.println("Sweet Corn Soup is 100 rs");

		                        double sweetCornPrice = 100;

		                        totalSoupsCost =
		                                totalSoupsCost + sweetCornPrice;
		                    }

		                    case "manchowsoup" -> {

		                        System.out.println("Manchow Soup is 120 rs");

		                        double manchowPrice = 120;

		                        totalSoupsCost =
		                                totalSoupsCost + manchowPrice;
		                    }

		                    case "hotsoursoup" -> {

		                        System.out.println("Hot & Sour Soup is 110 rs");

		                        double hotSourPrice = 110;

		                        totalSoupsCost =
		                                totalSoupsCost + hotSourPrice;
		                    }

		                    default ->
		                        System.out.println("Entered Item is not available !!");
		                    }

		                    System.out.println(
		                            "Do you want to continue with Soups? Click Y for Yes N for No");

		                    ssyn = sc.next();

		                } while (ssyn.equalsIgnoreCase("Y"));

		                System.out.println(
		                        "Your Total Soups Cost is : " + totalSoupsCost);

		                totalPrice = totalPrice + totalSoupsCost;

		                System.out.println("Exit From Soups Category !!!");
		            }


		            case "dessert" -> {

		                String dyn = "";
		                double totalDessertCost = 0;

		                do {

		                    System.out.println("Enter Item : ");

		                    String item = sc.next();

		                    switch (item) {

		                    case "icecream" -> {

		                        System.out.println("Ice Cream is 80 rs");

		                        double iceCreamPrice = 80;

		                        totalDessertCost =
		                                totalDessertCost + iceCreamPrice;
		                    }

		                    case "gulabjamun" -> {

		                        System.out.println("Gulab Jamun is 70 rs");

		                        double gulabJamunPrice = 70;

		                        totalDessertCost =
		                                totalDessertCost + gulabJamunPrice;
		                    }

		                    case "brownie" -> {

		                        System.out.println("Brownie is 120 rs");

		                        double browniePrice = 120;

		                        totalDessertCost =
		                                totalDessertCost + browniePrice;
		                    }

		                    case "fruitsalad" -> {

		                        System.out.println("Fruit Salad is 100 rs");

		                        double fruitSaladPrice = 100;

		                        totalDessertCost =
		                                totalDessertCost + fruitSaladPrice;
		                    }

		                    default ->
		                        System.out.println("Entered Item is not available !!");
		                    }

		                    System.out.println(
		                            "Do you want to continue with Dessert? Click Y for Yes N for No");

		                    dyn = sc.next();

		                } while (dyn.equalsIgnoreCase("Y"));

		                System.out.println(
		                        "Your Total Dessert Cost is : " + totalDessertCost);

		                totalPrice = totalPrice + totalDessertCost;

		                System.out.println("Exit From Dessert Category !!!");
		            }


		            default ->
		                System.out.println("Entered Category is not available !!");
		            }


		           
		            System.out.println(
		                    "Do you want to continue with Category? Click Y for Yes N for No");

		            yn = sc.next();

		        } while (yn.equalsIgnoreCase("Y"));


		        System.out.println("Total Price is : " + totalPrice);

		        System.out.println("Thank you for visiting !!");

		    }
		}