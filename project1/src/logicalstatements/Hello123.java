package logicalstatements;

import java.util.Scanner;

public class Hello123 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter connection type:");
        System.out.println("a - Domestic");
        System.out.println("b - Commercial");

        char type = sc.next().charAt(0);

        System.out.println("Enter the number of units consumed:");
        int units = sc.nextInt();

        double rate;
        double totalBill;

        switch (type) {
            case 'a':
                if (units <= 100) {
                    rate = 2;
                } else if (units <= 300) {
                    rate = 2;
                } else {
                    rate = 3;
                }
                break;

            case 'b':
                if (units <= 100) {
                    rate = 4;
                } else if (units <= 300) {
                    rate = 6;
                } else {
                    rate = 8;
                }
                break;

            default:
                System.out.println("Invalid connection type.");
                sc.close();
                return;
        }

        totalBill = units * rate;

        System.out.println("Total electricity bill: " + totalBill);

        sc.close();
    }
}
