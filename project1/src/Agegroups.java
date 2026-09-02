import java.util.Scanner;
public class Agegroups {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		 System.out.println("enter your age");
		 int age=sc.nextInt();
		 if (age>=0&&age<=5) {
			 System.out.println("you are a kid");
		 }else if (age>=5&&age<=12) {
			 System.out.println("you are a child");
		 }else if (age>=12&&age<=18) {
			 System.out.println("you are a teenager");
		 }else if (age>=18&&age<=60) {
			 System.out.println("you are a adult");
		 }else if (age>=60) {
			 System.out.println("you are a senior citizen");
		 }else {
			 System.out.println("invalid age");
		 }
		 
		

	}

}
