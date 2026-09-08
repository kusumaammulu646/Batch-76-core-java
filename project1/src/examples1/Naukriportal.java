package examples1;
import java.util.Scanner;
public class Naukriportal{
	
	
	    public static void main(String[] args) {

	        System.out.println("Welcome to Naukri Portal");

	        Scanner sc = new Scanner(System.in);

	        System.out.println("Can you please enter your name");
	        String name = sc.nextLine();

	        System.out.println("Can you please enter your age");
	        int age = sc.nextInt();
	        sc.nextLine();

	        if (age >= 21) {
	            System.out.println("Eligible");

	            System.out.println("Can you please enter your gender");
	            String gender = sc.nextLine();

	            if (gender.equalsIgnoreCase("male")) {
	                System.out.println("Eligible");

	            } else if (gender.equalsIgnoreCase("female")) {
	                System.out.println("Eligible");

	            } else {
	                System.out.println("Invalid gender");
	            }

	            System.out.println("Can you please enter your qualification");
	            String qualification = sc.nextLine();

	            if (qualification.equalsIgnoreCase("graduation")) {
	                System.out.println("Qualification eligible");

	            } else {
	                System.out.println("Qualification not eligible");
	            }

	            System.out.println("Can you please enter your skills");
	            String skills = sc.nextLine();

	            if (skills.equalsIgnoreCase("java")) {
	                System.out.println("Skills matched");

	            } else {
	                System.out.println("Skills not matched");
	            }

	            System.out.println("Can you please enter your experience");
	            int experience = sc.nextInt();
	            sc.nextLine();

	            if (experience >= 0) {
	                System.out.println("Experience eligible");

	            } else {
	                System.out.println("Experience not eligible");
	            }

	            System.out.println("Expected salary");
	            int salary = sc.nextInt();
	            sc.nextLine();

	            if (salary >= 500000) {
	                System.out.println("Expected");

	            } else {
	                System.out.println("Not expected");
	            }

	            System.out.println("Job role");
	            String jobrole = sc.nextLine();

	            if (jobrole.equalsIgnoreCase("java developer")) {
	                System.out.println("Interested");

	            } else {
	                System.out.println("Not interested");
	            }

	            System.out.println("Final validation");
	            String finalvalidation = sc.nextLine();

	            if (finalvalidation.equalsIgnoreCase("approved")) {
	                System.out.println("Selected");

	            } else if (finalvalidation.equalsIgnoreCase("rejected")) {
	                System.out.println("Rejected");

	            } else {
	                System.out.println("Invalid validation");
	            }

	            System.out.println("Final message");
	            String finalmessage = sc.nextLine();

	            if (finalmessage.equalsIgnoreCase("profile shortlisted")) {
	                System.out.println("Profile shortlisted");

	            } else {
	                System.out.println("Profile not shortlisted");
	            }

	        } else {
	            System.out.println("Not eligible");
	        }

	        sc.close();
	    }
	}